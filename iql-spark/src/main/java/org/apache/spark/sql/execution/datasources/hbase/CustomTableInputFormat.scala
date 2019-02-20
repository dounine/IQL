package org.apache.spark.sql.execution.datasources.hbase

import java.io.{File, FileInputStream, IOException}
import java.net.{InetAddress, InetSocketAddress, UnknownHostException}
import java.security.PrivilegedAction
import java.{lang, util}

import org.apache.hadoop.hbase.client.{Connection, ConnectionFactory}
import org.apache.hadoop.hbase.mapreduce.{TableInputFormat, TableSplit}
import org.apache.hadoop.hbase.util.{Bytes, Strings}
import org.apache.hadoop.hbase.{HBaseConfiguration, HRegionLocation, TableName}
import org.apache.hadoop.mapreduce.{InputSplit, JobContext}
import org.apache.hadoop.net.DNS
import org.apache.hadoop.security.UserGroupInformation


class CustomTableInputFormat extends TableInputFormat {
  var reverseDNSCacheMap: util.HashMap[InetAddress, String] = new util.HashMap[InetAddress, String]

  @throws(classOf[IOException])
  override def getSplits(context: JobContext): util.List[InputSplit] = {
    init(context)

    val conf = context.getConfiguration
    val start = conf.get("hbase.split.start", "")
    val end = conf.get("hbase.split.end", "")
    val parations = conf.getInt("hbase.split.parations", 2)

    val tableName: TableName = super.getTable.getName

    import scala.collection.JavaConversions._
    (0 until parations).map(Integer.toHexString).map(i => s"0$i".takeRight(2))
      .map {
        prefix =>
          val location: HRegionLocation = getRegionLocator.getRegionLocation(Bytes.toBytes(prefix), false)
          val isa: InetSocketAddress = new InetSocketAddress(location.getHostname, location.getPort)
          val regionAddress: InetAddress = isa.getAddress
          val regionLocation: String = reverse(regionAddress)

          val splitStart: Array[Byte] = Bytes.add(Bytes.toBytes(prefix + "|"), Bytes.toBytes(start))
          val splitStop: Array[Byte] = Bytes.add(Bytes.toBytes(prefix + "|"), Bytes.toBytes(end))
          new TableSplit(tableName, this.getScan, splitStart, splitStop, regionLocation)
      }
  }

  @throws(classOf[UnknownHostException])
  def reverse(ipAddress: InetAddress): lang.String = {
    var hostName = this.reverseDNSCacheMap.get(ipAddress)
    if (hostName == null) {
      var ipAddressString: String = null
      try {
        ipAddressString = DNS.reverseDns(ipAddress, null)
      }
      catch {
        case e: Exception =>
          ipAddressString = InetAddress.getByName(ipAddress.getHostAddress).getHostName
      }
      if (ipAddressString == null) throw new UnknownHostException("No host found for " + ipAddress)
      hostName = Strings.domainNamePointerToHostName(ipAddressString)
      this.reverseDNSCacheMap.put(ipAddress, hostName)
    }
    hostName
  }

  def init(context: JobContext): Unit = {
    val conf = context.getConfiguration
    System.setProperty("java.security.krb5.conf", conf.get("java.security.krb5.conf"))
    val tableName: TableName = TableName.valueOf(conf.get(TableInputFormat.INPUT_TABLE))

    if ("kerberos".equals(conf.get("hbase.security.authentication"))) {
      UserGroupInformation.setConfiguration(conf)
      UserGroupInformation.loginUserFromKeytab(conf.get("hbase.security.principal"), conf.get("hbase.security.keytab"))
    }

    initializeTable(ConnectionFactory.createConnection(conf), tableName)
  }
}

object oo {
  def main(args: Array[String]): Unit = {
    System.setProperty("java.security.krb5.conf", "/Users/huanghuanlai/dounine/kerberos/dev/krb5.conf")
    System.setProperty("sun.security.krb5.debug", "false")
    val conf = HBaseConfiguration.create()
    conf.addResource(new FileInputStream(new File("/Users/huanghuanlai/dounine/kerberos/dev/keytabs/hbase-site.xml")))
    conf.set("hadoop.security.authentication", "kerberos")

    UserGroupInformation.setConfiguration(conf)
    val ugi = UserGroupInformation.loginUserFromKeytabAndReturnUGI("hbase-bd@EXAMPLE.COM", "/Users/huanghuanlai/dounine/kerberos/bd/keytabs/hbase.headless.keytab")
    val connection = ugi.doAs(new PrivilegedAction[Connection] {
      override def run(): Connection = {
        ConnectionFactory.createConnection(conf)
      }
    })

    val admin = connection.getAdmin
    val eist = admin.tableExists(TableName.valueOf("test"))
    println(eist)
  }
}
