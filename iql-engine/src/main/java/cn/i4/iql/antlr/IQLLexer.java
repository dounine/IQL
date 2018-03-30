// Generated from D:/DevInstall/git/Git/cloud/iql/iql-engine/src/main/resources\IQL.g4 by ANTLR 4.5.3

package cn.i4.iql.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IQLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, STRING=31, 
		IDENTIFIER=32, BACKQUOTED_IDENTIFIER=33, SIMPLE_COMMENT=34, BRACKETED_EMPTY_COMMENT=35, 
		BRACKETED_COMMENT=36, WS=37, UNRECOGNIZED=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "STRING", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", 
		"DIGIT", "LETTER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", 
		"WS", "UNRECOGNIZED"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'load'", "'LOAD'", "'.'", "'where'", "'as'", "'save'", "'SAVE'", 
		"'partitionBy'", "'coalesce'", "'select'", "'SELECT'", "';'", "'insert'", 
		"'INSERT'", "'create'", "'CREATE'", "'set'", "'SET'", "'connect'", "'CONNECT'", 
		"'train'", "'TRAIN'", "'register'", "'REGISTER'", "'overwrite'", "'append'", 
		"'errorIfExists'", "'ignore'", "'and'", "'='", null, null, null, null, 
		"'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "STRING", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", 
		"SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", 
		"UNRECOGNIZED"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public IQLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u0171\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \7"+
		" \u011a\n \f \16 \u011d\13 \3 \3 \3 \3 \3 \7 \u0124\n \f \16 \u0127\13"+
		" \3 \5 \u012a\n \3!\3!\3!\6!\u012f\n!\r!\16!\u0130\3\"\3\"\3\"\3\"\7\""+
		"\u0137\n\"\f\"\16\"\u013a\13\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\7%\u0146"+
		"\n%\f%\16%\u0149\13%\3%\5%\u014c\n%\3%\5%\u014f\n%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\7\'\u015f\n\'\f\'\16\'\u0162\13\'\3\'\3\'"+
		"\3\'\3\'\3\'\3(\6(\u016a\n(\r(\16(\u016b\3(\3(\3)\3)\3\u0160\2*\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E\2G\2I$K%M&O\'Q(\3\2\n\4\2))^^\4\2$$^^\3\2bb\3\2\62;\4\2C\\c|\4"+
		"\2\f\f\17\17\3\2--\5\2\13\f\17\17\"\"\u017d\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\3S\3\2\2\2\5X\3\2\2\2\7]\3\2\2\2\t_\3\2\2\2\13e\3\2\2\2\rh\3"+
		"\2\2\2\17m\3\2\2\2\21r\3\2\2\2\23~\3\2\2\2\25\u0087\3\2\2\2\27\u008e\3"+
		"\2\2\2\31\u0095\3\2\2\2\33\u0097\3\2\2\2\35\u009e\3\2\2\2\37\u00a5\3\2"+
		"\2\2!\u00ac\3\2\2\2#\u00b3\3\2\2\2%\u00b7\3\2\2\2\'\u00bb\3\2\2\2)\u00c3"+
		"\3\2\2\2+\u00cb\3\2\2\2-\u00d1\3\2\2\2/\u00d7\3\2\2\2\61\u00e0\3\2\2\2"+
		"\63\u00e9\3\2\2\2\65\u00f3\3\2\2\2\67\u00fa\3\2\2\29\u0108\3\2\2\2;\u010f"+
		"\3\2\2\2=\u0113\3\2\2\2?\u0129\3\2\2\2A\u012e\3\2\2\2C\u0132\3\2\2\2E"+
		"\u013d\3\2\2\2G\u013f\3\2\2\2I\u0141\3\2\2\2K\u0152\3\2\2\2M\u0159\3\2"+
		"\2\2O\u0169\3\2\2\2Q\u016f\3\2\2\2ST\7n\2\2TU\7q\2\2UV\7c\2\2VW\7f\2\2"+
		"W\4\3\2\2\2XY\7N\2\2YZ\7Q\2\2Z[\7C\2\2[\\\7F\2\2\\\6\3\2\2\2]^\7\60\2"+
		"\2^\b\3\2\2\2_`\7y\2\2`a\7j\2\2ab\7g\2\2bc\7t\2\2cd\7g\2\2d\n\3\2\2\2"+
		"ef\7c\2\2fg\7u\2\2g\f\3\2\2\2hi\7u\2\2ij\7c\2\2jk\7x\2\2kl\7g\2\2l\16"+
		"\3\2\2\2mn\7U\2\2no\7C\2\2op\7X\2\2pq\7G\2\2q\20\3\2\2\2rs\7r\2\2st\7"+
		"c\2\2tu\7t\2\2uv\7v\2\2vw\7k\2\2wx\7v\2\2xy\7k\2\2yz\7q\2\2z{\7p\2\2{"+
		"|\7D\2\2|}\7{\2\2}\22\3\2\2\2~\177\7e\2\2\177\u0080\7q\2\2\u0080\u0081"+
		"\7c\2\2\u0081\u0082\7n\2\2\u0082\u0083\7g\2\2\u0083\u0084\7u\2\2\u0084"+
		"\u0085\7e\2\2\u0085\u0086\7g\2\2\u0086\24\3\2\2\2\u0087\u0088\7u\2\2\u0088"+
		"\u0089\7g\2\2\u0089\u008a\7n\2\2\u008a\u008b\7g\2\2\u008b\u008c\7e\2\2"+
		"\u008c\u008d\7v\2\2\u008d\26\3\2\2\2\u008e\u008f\7U\2\2\u008f\u0090\7"+
		"G\2\2\u0090\u0091\7N\2\2\u0091\u0092\7G\2\2\u0092\u0093\7E\2\2\u0093\u0094"+
		"\7V\2\2\u0094\30\3\2\2\2\u0095\u0096\7=\2\2\u0096\32\3\2\2\2\u0097\u0098"+
		"\7k\2\2\u0098\u0099\7p\2\2\u0099\u009a\7u\2\2\u009a\u009b\7g\2\2\u009b"+
		"\u009c\7t\2\2\u009c\u009d\7v\2\2\u009d\34\3\2\2\2\u009e\u009f\7K\2\2\u009f"+
		"\u00a0\7P\2\2\u00a0\u00a1\7U\2\2\u00a1\u00a2\7G\2\2\u00a2\u00a3\7T\2\2"+
		"\u00a3\u00a4\7V\2\2\u00a4\36\3\2\2\2\u00a5\u00a6\7e\2\2\u00a6\u00a7\7"+
		"t\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab"+
		"\7g\2\2\u00ab \3\2\2\2\u00ac\u00ad\7E\2\2\u00ad\u00ae\7T\2\2\u00ae\u00af"+
		"\7G\2\2\u00af\u00b0\7C\2\2\u00b0\u00b1\7V\2\2\u00b1\u00b2\7G\2\2\u00b2"+
		"\"\3\2\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7v\2\2\u00b6"+
		"$\3\2\2\2\u00b7\u00b8\7U\2\2\u00b8\u00b9\7G\2\2\u00b9\u00ba\7V\2\2\u00ba"+
		"&\3\2\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7p\2\2\u00be"+
		"\u00bf\7p\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7e\2\2\u00c1\u00c2\7v\2\2"+
		"\u00c2(\3\2\2\2\u00c3\u00c4\7E\2\2\u00c4\u00c5\7Q\2\2\u00c5\u00c6\7P\2"+
		"\2\u00c6\u00c7\7P\2\2\u00c7\u00c8\7G\2\2\u00c8\u00c9\7E\2\2\u00c9\u00ca"+
		"\7V\2\2\u00ca*\3\2\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce"+
		"\7c\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7p\2\2\u00d0,\3\2\2\2\u00d1\u00d2"+
		"\7V\2\2\u00d2\u00d3\7T\2\2\u00d3\u00d4\7C\2\2\u00d4\u00d5\7K\2\2\u00d5"+
		"\u00d6\7P\2\2\u00d6.\3\2\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7g\2\2\u00d9"+
		"\u00da\7i\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7v\2\2"+
		"\u00dd\u00de\7g\2\2\u00de\u00df\7t\2\2\u00df\60\3\2\2\2\u00e0\u00e1\7"+
		"T\2\2\u00e1\u00e2\7G\2\2\u00e2\u00e3\7I\2\2\u00e3\u00e4\7K\2\2\u00e4\u00e5"+
		"\7U\2\2\u00e5\u00e6\7V\2\2\u00e6\u00e7\7G\2\2\u00e7\u00e8\7T\2\2\u00e8"+
		"\62\3\2\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7x\2\2\u00eb\u00ec\7g\2\2\u00ec"+
		"\u00ed\7t\2\2\u00ed\u00ee\7y\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7k\2\2"+
		"\u00f0\u00f1\7v\2\2\u00f1\u00f2\7g\2\2\u00f2\64\3\2\2\2\u00f3\u00f4\7"+
		"c\2\2\u00f4\u00f5\7r\2\2\u00f5\u00f6\7r\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8"+
		"\7p\2\2\u00f8\u00f9\7f\2\2\u00f9\66\3\2\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc"+
		"\7t\2\2\u00fc\u00fd\7t\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7t\2\2\u00ff"+
		"\u0100\7K\2\2\u0100\u0101\7h\2\2\u0101\u0102\7G\2\2\u0102\u0103\7z\2\2"+
		"\u0103\u0104\7k\2\2\u0104\u0105\7u\2\2\u0105\u0106\7v\2\2\u0106\u0107"+
		"\7u\2\2\u01078\3\2\2\2\u0108\u0109\7k\2\2\u0109\u010a\7i\2\2\u010a\u010b"+
		"\7p\2\2\u010b\u010c\7q\2\2\u010c\u010d\7t\2\2\u010d\u010e\7g\2\2\u010e"+
		":\3\2\2\2\u010f\u0110\7c\2\2\u0110\u0111\7p\2\2\u0111\u0112\7f\2\2\u0112"+
		"<\3\2\2\2\u0113\u0114\7?\2\2\u0114>\3\2\2\2\u0115\u011b\7)\2\2\u0116\u011a"+
		"\n\2\2\2\u0117\u0118\7^\2\2\u0118\u011a\13\2\2\2\u0119\u0116\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u012a\7)\2\2\u011f"+
		"\u0125\7$\2\2\u0120\u0124\n\3\2\2\u0121\u0122\7^\2\2\u0122\u0124\13\2"+
		"\2\2\u0123\u0120\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0128\u012a\7$\2\2\u0129\u0115\3\2\2\2\u0129\u011f\3\2\2\2\u012a"+
		"@\3\2\2\2\u012b\u012f\5G$\2\u012c\u012f\5E#\2\u012d\u012f\7a\2\2\u012e"+
		"\u012b\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131B\3\2\2\2\u0132\u0138"+
		"\7b\2\2\u0133\u0137\n\4\2\2\u0134\u0135\7b\2\2\u0135\u0137\7b\2\2\u0136"+
		"\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013c\7b\2\2\u013cD\3\2\2\2\u013d\u013e\t\5\2\2\u013eF\3\2\2\2\u013f"+
		"\u0140\t\6\2\2\u0140H\3\2\2\2\u0141\u0142\7/\2\2\u0142\u0143\7/\2\2\u0143"+
		"\u0147\3\2\2\2\u0144\u0146\n\7\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2"+
		"\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u014c\7\17\2\2\u014b\u014a\3\2\2\2\u014b\u014c\3"+
		"\2\2\2\u014c\u014e\3\2\2\2\u014d\u014f\7\f\2\2\u014e\u014d\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\b%\2\2\u0151J\3\2\2\2\u0152"+
		"\u0153\7\61\2\2\u0153\u0154\7,\2\2\u0154\u0155\7,\2\2\u0155\u0156\7\61"+
		"\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b&\2\2\u0158L\3\2\2\2\u0159\u015a"+
		"\7\61\2\2\u015a\u015b\7,\2\2\u015b\u015c\3\2\2\2\u015c\u0160\n\b\2\2\u015d"+
		"\u015f\13\2\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u0161\3"+
		"\2\2\2\u0160\u015e\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0164\7,\2\2\u0164\u0165\7\61\2\2\u0165\u0166\3\2\2\2\u0166\u0167\b\'"+
		"\2\2\u0167N\3\2\2\2\u0168\u016a\t\t\2\2\u0169\u0168\3\2\2\2\u016a\u016b"+
		"\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u016e\b(\2\2\u016eP\3\2\2\2\u016f\u0170\13\2\2\2\u0170R\3\2\2\2\21\2"+
		"\u0119\u011b\u0123\u0125\u0129\u012e\u0130\u0136\u0138\u0147\u014b\u014e"+
		"\u0160\u016b\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}