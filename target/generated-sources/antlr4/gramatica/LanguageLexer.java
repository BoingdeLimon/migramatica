// Generated from gramatica\Language.g4 by ANTLR 4.9.2
package gramatica;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, FLOAT=2, BOOLEAN=3, STRING=4, IF=5, ELSE=6, FOR=7, PRINT=8, BOOLEAN_LITERAL=9, 
		ID=10, INT_LITERAL=11, FLOAT_LITERAL=12, STRING_LITERAL=13, PLUSPLUS=14, 
		WS=15, COMMENT=16, LINE_COMMENT=17, EQ=18, LT=19, GT=20, LE=21, GE=22, 
		EQEQ=23, NEQ=24, PLUS=25, MINUS=26, MUL=27, DIV=28, LPAREN=29, RPAREN=30, 
		LBRACE=31, RBRACE=32, SEMI=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "FLOAT", "BOOLEAN", "STRING", "IF", "ELSE", "FOR", "PRINT", "BOOLEAN_LITERAL", 
			"ID", "INT_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", "PLUSPLUS", "WS", 
			"COMMENT", "LINE_COMMENT", "EQ", "LT", "GT", "LE", "GE", "EQEQ", "NEQ", 
			"PLUS", "MINUS", "MUL", "DIV", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"SEMI"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'boolean'", "'string'", "'if'", "'else'", 
			"'for'", "'print'", null, null, null, null, null, "'++'", null, null, 
			null, "'='", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'+'", "'-'", 
			"'*'", "'/'", "'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "FLOAT", "BOOLEAN", "STRING", "IF", "ELSE", "FOR", "PRINT", 
			"BOOLEAN_LITERAL", "ID", "INT_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", 
			"PLUSPLUS", "WS", "COMMENT", "LINE_COMMENT", "EQ", "LT", "GT", "LE", 
			"GE", "EQEQ", "NEQ", "PLUS", "MINUS", "MUL", "DIV", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "SEMI"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public LanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00eb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\nz\n\n\3\13\3\13\7\13~\n\13\f\13\16\13\u0081\13\13\3\f\6"+
		"\f\u0084\n\f\r\f\16\f\u0085\3\r\6\r\u0089\n\r\r\r\16\r\u008a\3\r\3\r\7"+
		"\r\u008f\n\r\f\r\16\r\u0092\13\r\3\r\3\r\6\r\u0096\n\r\r\r\16\r\u0097"+
		"\5\r\u009a\n\r\3\16\3\16\7\16\u009e\n\16\f\16\16\16\u00a1\13\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\6\20\u00a9\n\20\r\20\16\20\u00aa\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\7\21\u00b3\n\21\f\21\16\21\u00b6\13\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00c1\n\22\f\22\16\22\u00c4\13\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\4\u009f\u00b4\2#\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2"+
		"\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\4\2\f\f\17\17"+
		"\2\u00f5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2"+
		"\5I\3\2\2\2\7O\3\2\2\2\tW\3\2\2\2\13^\3\2\2\2\ra\3\2\2\2\17f\3\2\2\2\21"+
		"j\3\2\2\2\23y\3\2\2\2\25{\3\2\2\2\27\u0083\3\2\2\2\31\u0099\3\2\2\2\33"+
		"\u009b\3\2\2\2\35\u00a4\3\2\2\2\37\u00a8\3\2\2\2!\u00ae\3\2\2\2#\u00bc"+
		"\3\2\2\2%\u00c7\3\2\2\2\'\u00c9\3\2\2\2)\u00cb\3\2\2\2+\u00cd\3\2\2\2"+
		"-\u00d0\3\2\2\2/\u00d3\3\2\2\2\61\u00d6\3\2\2\2\63\u00d9\3\2\2\2\65\u00db"+
		"\3\2\2\2\67\u00dd\3\2\2\29\u00df\3\2\2\2;\u00e1\3\2\2\2=\u00e3\3\2\2\2"+
		"?\u00e5\3\2\2\2A\u00e7\3\2\2\2C\u00e9\3\2\2\2EF\7k\2\2FG\7p\2\2GH\7v\2"+
		"\2H\4\3\2\2\2IJ\7h\2\2JK\7n\2\2KL\7q\2\2LM\7c\2\2MN\7v\2\2N\6\3\2\2\2"+
		"OP\7d\2\2PQ\7q\2\2QR\7q\2\2RS\7n\2\2ST\7g\2\2TU\7c\2\2UV\7p\2\2V\b\3\2"+
		"\2\2WX\7u\2\2XY\7v\2\2YZ\7t\2\2Z[\7k\2\2[\\\7p\2\2\\]\7i\2\2]\n\3\2\2"+
		"\2^_\7k\2\2_`\7h\2\2`\f\3\2\2\2ab\7g\2\2bc\7n\2\2cd\7u\2\2de\7g\2\2e\16"+
		"\3\2\2\2fg\7h\2\2gh\7q\2\2hi\7t\2\2i\20\3\2\2\2jk\7r\2\2kl\7t\2\2lm\7"+
		"k\2\2mn\7p\2\2no\7v\2\2o\22\3\2\2\2pq\7v\2\2qr\7t\2\2rs\7w\2\2sz\7g\2"+
		"\2tu\7h\2\2uv\7c\2\2vw\7n\2\2wx\7u\2\2xz\7g\2\2yp\3\2\2\2yt\3\2\2\2z\24"+
		"\3\2\2\2{\177\t\2\2\2|~\t\3\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080\26\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\t\4"+
		"\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\30\3\2\2\2\u0087\u0089\t\4\2\2\u0088\u0087\3\2\2"+
		"\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u0090\7\60\2\2\u008d\u008f\t\4\2\2\u008e\u008d\3\2\2\2"+
		"\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u009a"+
		"\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\7\60\2\2\u0094\u0096\t\4\2\2"+
		"\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0088\3\2\2\2\u0099\u0093\3\2\2\2\u009a"+
		"\32\3\2\2\2\u009b\u009f\7$\2\2\u009c\u009e\13\2\2\2\u009d\u009c\3\2\2"+
		"\2\u009e\u00a1\3\2\2\2\u009f\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7$\2\2\u00a3\34\3\2\2\2\u00a4"+
		"\u00a5\7-\2\2\u00a5\u00a6\7-\2\2\u00a6\36\3\2\2\2\u00a7\u00a9\t\5\2\2"+
		"\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\20\2\2\u00ad \3\2\2\2\u00ae"+
		"\u00af\7\61\2\2\u00af\u00b0\7,\2\2\u00b0\u00b4\3\2\2\2\u00b1\u00b3\13"+
		"\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7,"+
		"\2\2\u00b8\u00b9\7\61\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\b\21\2\2\u00bb"+
		"\"\3\2\2\2\u00bc\u00bd\7\61\2\2\u00bd\u00be\7\61\2\2\u00be\u00c2\3\2\2"+
		"\2\u00bf\u00c1\n\6\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00c6\b\22\2\2\u00c6$\3\2\2\2\u00c7\u00c8\7?\2\2\u00c8&\3\2\2\2\u00c9"+
		"\u00ca\7>\2\2\u00ca(\3\2\2\2\u00cb\u00cc\7@\2\2\u00cc*\3\2\2\2\u00cd\u00ce"+
		"\7>\2\2\u00ce\u00cf\7?\2\2\u00cf,\3\2\2\2\u00d0\u00d1\7@\2\2\u00d1\u00d2"+
		"\7?\2\2\u00d2.\3\2\2\2\u00d3\u00d4\7?\2\2\u00d4\u00d5\7?\2\2\u00d5\60"+
		"\3\2\2\2\u00d6\u00d7\7#\2\2\u00d7\u00d8\7?\2\2\u00d8\62\3\2\2\2\u00d9"+
		"\u00da\7-\2\2\u00da\64\3\2\2\2\u00db\u00dc\7/\2\2\u00dc\66\3\2\2\2\u00dd"+
		"\u00de\7,\2\2\u00de8\3\2\2\2\u00df\u00e0\7\61\2\2\u00e0:\3\2\2\2\u00e1"+
		"\u00e2\7*\2\2\u00e2<\3\2\2\2\u00e3\u00e4\7+\2\2\u00e4>\3\2\2\2\u00e5\u00e6"+
		"\7}\2\2\u00e6@\3\2\2\2\u00e7\u00e8\7\177\2\2\u00e8B\3\2\2\2\u00e9\u00ea"+
		"\7=\2\2\u00eaD\3\2\2\2\16\2y\177\u0085\u008a\u0090\u0097\u0099\u009f\u00aa"+
		"\u00b4\u00c2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}