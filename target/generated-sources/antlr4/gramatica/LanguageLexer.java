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
		ENTERO=1, FLOTANTE=2, BOOLEANO=3, CADENA=4, IF=5, ELSE=6, FOR=7, PRINT=8, 
		BOOLEAN_LITERAL=9, ID=10, INT_LITERAL=11, FLOAT_LITERAL=12, STRING_LITERAL=13, 
		PLUSPLUS=14, WS=15, COMMENT=16, LINE_COMMENT=17, EQ=18, LT=19, GT=20, 
		LE=21, GE=22, EQEQ=23, NEQ=24, PLUS=25, MINUS=26, MUL=27, DIV=28, LPAREN=29, 
		RPAREN=30, LBRACE=31, RBRACE=32, SEMI=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ENTERO", "FLOTANTE", "BOOLEANO", "CADENA", "IF", "ELSE", "FOR", "PRINT", 
			"BOOLEAN_LITERAL", "ID", "INT_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", 
			"PLUSPLUS", "WS", "COMMENT", "LINE_COMMENT", "EQ", "LT", "GT", "LE", 
			"GE", "EQEQ", "NEQ", "PLUS", "MINUS", "MUL", "DIV", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "SEMI"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'entero'", "'flotante'", "'booleano'", "'cadena'", "'si'", "'contrario'", 
			"'ciclo'", "'hola'", null, null, null, null, null, "'++'", null, null, 
			null, "'='", "'<<'", "'>>'", "'<<='", "'>>='", "'=='", "'!='", "'+'", 
			"'-'", "'*'", "'/'", "'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ENTERO", "FLOTANTE", "BOOLEANO", "CADENA", "IF", "ELSE", "FOR", 
			"PRINT", "BOOLEAN_LITERAL", "ID", "INT_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00fc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0087"+
		"\n\n\3\13\3\13\7\13\u008b\n\13\f\13\16\13\u008e\13\13\3\f\6\f\u0091\n"+
		"\f\r\f\16\f\u0092\3\r\6\r\u0096\n\r\r\r\16\r\u0097\3\r\3\r\7\r\u009c\n"+
		"\r\f\r\16\r\u009f\13\r\3\r\3\r\6\r\u00a3\n\r\r\r\16\r\u00a4\5\r\u00a7"+
		"\n\r\3\16\3\16\7\16\u00ab\n\16\f\16\16\16\u00ae\13\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\6\20\u00b6\n\20\r\20\16\20\u00b7\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\7\21\u00c0\n\21\f\21\16\21\u00c3\13\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\7\22\u00ce\n\22\f\22\16\22\u00d1\13\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\4\u00ac\u00c1\2#\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\4"+
		"\2\f\f\17\17\2\u0106\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\3E\3\2\2\2\5L\3\2\2\2\7U\3\2\2\2\t^\3\2\2\2\13e\3\2\2\2\rh\3\2\2\2\17"+
		"r\3\2\2\2\21x\3\2\2\2\23\u0086\3\2\2\2\25\u0088\3\2\2\2\27\u0090\3\2\2"+
		"\2\31\u00a6\3\2\2\2\33\u00a8\3\2\2\2\35\u00b1\3\2\2\2\37\u00b5\3\2\2\2"+
		"!\u00bb\3\2\2\2#\u00c9\3\2\2\2%\u00d4\3\2\2\2\'\u00d6\3\2\2\2)\u00d9\3"+
		"\2\2\2+\u00dc\3\2\2\2-\u00e0\3\2\2\2/\u00e4\3\2\2\2\61\u00e7\3\2\2\2\63"+
		"\u00ea\3\2\2\2\65\u00ec\3\2\2\2\67\u00ee\3\2\2\29\u00f0\3\2\2\2;\u00f2"+
		"\3\2\2\2=\u00f4\3\2\2\2?\u00f6\3\2\2\2A\u00f8\3\2\2\2C\u00fa\3\2\2\2E"+
		"F\7g\2\2FG\7p\2\2GH\7v\2\2HI\7g\2\2IJ\7t\2\2JK\7q\2\2K\4\3\2\2\2LM\7h"+
		"\2\2MN\7n\2\2NO\7q\2\2OP\7v\2\2PQ\7c\2\2QR\7p\2\2RS\7v\2\2ST\7g\2\2T\6"+
		"\3\2\2\2UV\7d\2\2VW\7q\2\2WX\7q\2\2XY\7n\2\2YZ\7g\2\2Z[\7c\2\2[\\\7p\2"+
		"\2\\]\7q\2\2]\b\3\2\2\2^_\7e\2\2_`\7c\2\2`a\7f\2\2ab\7g\2\2bc\7p\2\2c"+
		"d\7c\2\2d\n\3\2\2\2ef\7u\2\2fg\7k\2\2g\f\3\2\2\2hi\7e\2\2ij\7q\2\2jk\7"+
		"p\2\2kl\7v\2\2lm\7t\2\2mn\7c\2\2no\7t\2\2op\7k\2\2pq\7q\2\2q\16\3\2\2"+
		"\2rs\7e\2\2st\7k\2\2tu\7e\2\2uv\7n\2\2vw\7q\2\2w\20\3\2\2\2xy\7j\2\2y"+
		"z\7q\2\2z{\7n\2\2{|\7c\2\2|\22\3\2\2\2}~\7v\2\2~\177\7t\2\2\177\u0080"+
		"\7w\2\2\u0080\u0087\7g\2\2\u0081\u0082\7h\2\2\u0082\u0083\7c\2\2\u0083"+
		"\u0084\7n\2\2\u0084\u0085\7u\2\2\u0085\u0087\7g\2\2\u0086}\3\2\2\2\u0086"+
		"\u0081\3\2\2\2\u0087\24\3\2\2\2\u0088\u008c\t\2\2\2\u0089\u008b\t\3\2"+
		"\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\26\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0091\t\4\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\30\3\2\2\2\u0094\u0096\t\4\2\2\u0095\u0094\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009d\7\60\2\2\u009a\u009c\t\4\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a7\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a2\7\60\2\2\u00a1\u00a3\t\4\2\2\u00a2\u00a1\3"+
		"\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a7\3\2\2\2\u00a6\u0095\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a7\32\3\2\2"+
		"\2\u00a8\u00ac\7$\2\2\u00a9\u00ab\13\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b0\7$\2\2\u00b0\34\3\2\2\2\u00b1\u00b2\7-\2\2"+
		"\u00b2\u00b3\7-\2\2\u00b3\36\3\2\2\2\u00b4\u00b6\t\5\2\2\u00b5\u00b4\3"+
		"\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00ba\b\20\2\2\u00ba \3\2\2\2\u00bb\u00bc\7\61\2"+
		"\2\u00bc\u00bd\7,\2\2\u00bd\u00c1\3\2\2\2\u00be\u00c0\13\2\2\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7,\2\2\u00c5\u00c6\7\61"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\b\21\2\2\u00c8\"\3\2\2\2\u00c9\u00ca"+
		"\7&\2\2\u00ca\u00cb\7&\2\2\u00cb\u00cf\3\2\2\2\u00cc\u00ce\n\6\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\b\22\2\2\u00d3"+
		"$\3\2\2\2\u00d4\u00d5\7?\2\2\u00d5&\3\2\2\2\u00d6\u00d7\7>\2\2\u00d7\u00d8"+
		"\7>\2\2\u00d8(\3\2\2\2\u00d9\u00da\7@\2\2\u00da\u00db\7@\2\2\u00db*\3"+
		"\2\2\2\u00dc\u00dd\7>\2\2\u00dd\u00de\7>\2\2\u00de\u00df\7?\2\2\u00df"+
		",\3\2\2\2\u00e0\u00e1\7@\2\2\u00e1\u00e2\7@\2\2\u00e2\u00e3\7?\2\2\u00e3"+
		".\3\2\2\2\u00e4\u00e5\7?\2\2\u00e5\u00e6\7?\2\2\u00e6\60\3\2\2\2\u00e7"+
		"\u00e8\7#\2\2\u00e8\u00e9\7?\2\2\u00e9\62\3\2\2\2\u00ea\u00eb\7-\2\2\u00eb"+
		"\64\3\2\2\2\u00ec\u00ed\7/\2\2\u00ed\66\3\2\2\2\u00ee\u00ef\7,\2\2\u00ef"+
		"8\3\2\2\2\u00f0\u00f1\7\61\2\2\u00f1:\3\2\2\2\u00f2\u00f3\7*\2\2\u00f3"+
		"<\3\2\2\2\u00f4\u00f5\7+\2\2\u00f5>\3\2\2\2\u00f6\u00f7\7}\2\2\u00f7@"+
		"\3\2\2\2\u00f8\u00f9\7\177\2\2\u00f9B\3\2\2\2\u00fa\u00fb\7=\2\2\u00fb"+
		"D\3\2\2\2\16\2\u0086\u008c\u0092\u0097\u009d\u00a4\u00a6\u00ac\u00b7\u00c1"+
		"\u00cf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}