// Generated from gramatica\Language.g4 by ANTLR 4.9.2
package gramatica;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_variableDecl = 2, RULE_type = 3, 
		RULE_assignment = 4, RULE_ifStmt = 5, RULE_forStmt = 6, RULE_printStmt = 7, 
		RULE_incrementStmt = 8, RULE_block = 9, RULE_expr = 10, RULE_literal = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "variableDecl", "type", "assignment", "ifStmt", 
			"forStmt", "printStmt", "incrementStmt", "block", "expr", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'entero'", "'flotante'", "'booleano'", "'cadena'", "'if'", "'else'", 
			"'for'", "'print'", null, null, null, null, null, "'++'", null, null, 
			null, "'='", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'+'", "'-'", 
			"'*'", "'/'", "'('", "')'", "'{'", "'}'", "';'"
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

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LanguageParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << BOOLEANO) | (1L << CADENA) | (1L << IF) | (1L << FOR) | (1L << PRINT) | (1L << ID) | (1L << PLUSPLUS) | (1L << LBRACE) | (1L << SEMI))) != 0)) {
				{
				{
				setState(24);
				statement();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LanguageParser.SEMI, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public IncrementStmtContext incrementStmt() {
			return getRuleContext(IncrementStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				variableDecl();
				setState(33);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				assignment();
				setState(36);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				ifStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				forStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				printStmt();
				setState(41);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				incrementStmt();
				setState(44);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(46);
				block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(47);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LanguageParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VariableDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitVariableDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitVariableDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclContext variableDecl() throws RecognitionException {
		VariableDeclContext _localctx = new VariableDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			type();
			setState(51);
			match(ID);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(52);
				match(EQ);
				setState(53);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(LanguageParser.ENTERO, 0); }
		public TerminalNode FLOTANTE() { return getToken(LanguageParser.FLOTANTE, 0); }
		public TerminalNode BOOLEANO() { return getToken(LanguageParser.BOOLEANO, 0); }
		public TerminalNode CADENA() { return getToken(LanguageParser.CADENA, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << BOOLEANO) | (1L << CADENA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LanguageParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ID);
			setState(59);
			match(EQ);
			setState(60);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmtContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(LanguageParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(LanguageParser.IF, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(LanguageParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(LanguageParser.LPAREN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(LanguageParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(LanguageParser.RPAREN, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(LanguageParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(LanguageParser.ELSE, i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(IF);
			setState(63);
			match(LPAREN);
			setState(64);
			expr(0);
			setState(65);
			match(RPAREN);
			setState(66);
			block();
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					match(ELSE);
					setState(68);
					match(IF);
					setState(69);
					match(LPAREN);
					setState(70);
					expr(0);
					setState(71);
					match(RPAREN);
					setState(72);
					block();
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(79);
				match(ELSE);
				setState(80);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LanguageParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(LanguageParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(LanguageParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(LanguageParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(LanguageParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableDeclContext variableDecl() {
			return getRuleContext(VariableDeclContext.class,0);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IncrementStmtContext incrementStmt() {
			return getRuleContext(IncrementStmtContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(FOR);
			setState(84);
			match(LPAREN);
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case FLOTANTE:
			case BOOLEANO:
			case CADENA:
				{
				setState(85);
				variableDecl();
				}
				break;
			case ID:
				{
				setState(86);
				assignment();
				}
				break;
			case SEMI:
				break;
			default:
				break;
			}
			setState(89);
			match(SEMI);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_LITERAL) | (1L << ID) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << PLUSPLUS) | (1L << LPAREN))) != 0)) {
				{
				setState(90);
				expr(0);
				}
			}

			setState(93);
			match(SEMI);
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(94);
				assignment();
				}
				break;
			case 2:
				{
				setState(95);
				incrementStmt();
				}
				break;
			}
			setState(98);
			match(RPAREN);
			setState(99);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LanguageParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(LanguageParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LanguageParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(LanguageParser.SEMI, 0); }
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterPrintStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitPrintStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitPrintStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(PRINT);
			setState(102);
			match(LPAREN);
			setState(103);
			expr(0);
			setState(104);
			match(RPAREN);
			setState(105);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncrementStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode PLUSPLUS() { return getToken(LanguageParser.PLUSPLUS, 0); }
		public IncrementStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterIncrementStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitIncrementStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitIncrementStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementStmtContext incrementStmt() throws RecognitionException {
		IncrementStmtContext _localctx = new IncrementStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_incrementStmt);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(ID);
				setState(108);
				match(PLUSPLUS);
				}
				break;
			case PLUSPLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(PLUSPLUS);
				setState(110);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LanguageParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LanguageParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(LBRACE);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << FLOTANTE) | (1L << BOOLEANO) | (1L << CADENA) | (1L << IF) | (1L << FOR) | (1L << PRINT) | (1L << ID) | (1L << PLUSPLUS) | (1L << LBRACE) | (1L << SEMI))) != 0)) {
				{
				{
				setState(114);
				statement();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PreIncrementExprContext extends ExprContext {
		public TerminalNode PLUSPLUS() { return getToken(LanguageParser.PLUSPLUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PreIncrementExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterPreIncrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitPreIncrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitPreIncrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicativeExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LanguageParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LanguageParser.DIV, 0); }
		public MultiplicativeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitMultiplicativeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQEQ() { return getToken(LanguageParser.EQEQ, 0); }
		public TerminalNode NEQ() { return getToken(LanguageParser.NEQ, 0); }
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitEqualityExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(LanguageParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LanguageParser.MINUS, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public VarExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralExprContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(LanguageParser.LT, 0); }
		public TerminalNode GT() { return getToken(LanguageParser.GT, 0); }
		public TerminalNode LE() { return getToken(LanguageParser.LE, 0); }
		public TerminalNode GE() { return getToken(LanguageParser.GE, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitRelationalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitRelationalExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(LanguageParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LanguageParser.RPAREN, 0); }
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostIncrementExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUSPLUS() { return getToken(LanguageParser.PLUSPLUS, 0); }
		public PostIncrementExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterPostIncrementExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitPostIncrementExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitPostIncrementExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUSPLUS:
				{
				_localctx = new PreIncrementExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(123);
				match(PLUSPLUS);
				setState(124);
				expr(8);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(LPAREN);
				setState(126);
				expr(0);
				setState(127);
				match(RPAREN);
				}
				break;
			case ID:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(ID);
				}
				break;
			case BOOLEAN_LITERAL:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				_localctx = new LiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(133);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(134);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(135);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(137);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(138);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(140);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LE) | (1L << GE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(141);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(143);
						_la = _input.LA(1);
						if ( !(_la==EQEQ || _la==NEQ) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(144);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new PostIncrementExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(145);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(146);
						match(PLUSPLUS);
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(LanguageParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(LanguageParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(LanguageParser.STRING_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(LanguageParser.BOOLEAN_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN_LITERAL) | (1L << INT_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u009d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n\3\3\4"+
		"\3\4\3\4\3\4\5\49\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7M\n\7\f\7\16\7P\13\7\3\7\3\7\5\7T\n\7\3\b"+
		"\3\b\3\b\3\b\5\bZ\n\b\3\b\3\b\5\b^\n\b\3\b\3\b\3\b\5\bc\n\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\nr\n\n\3\13\3\13\7\13v\n"+
		"\13\f\13\16\13y\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0086\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u0096\n\f\f\f\16\f\u0099\13\f\3\r\3\r\3\r\2\3\26\16\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\2\b\3\2\3\6\3\2\35\36\3\2\33\34\3\2\25\30\3\2\31\32\4"+
		"\2\13\13\r\17\2\u00aa\2\35\3\2\2\2\4\62\3\2\2\2\6\64\3\2\2\2\b:\3\2\2"+
		"\2\n<\3\2\2\2\f@\3\2\2\2\16U\3\2\2\2\20g\3\2\2\2\22q\3\2\2\2\24s\3\2\2"+
		"\2\26\u0085\3\2\2\2\30\u009a\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\37"+
		"\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\7\2\2"+
		"\3!\3\3\2\2\2\"#\5\6\4\2#$\7#\2\2$\63\3\2\2\2%&\5\n\6\2&\'\7#\2\2\'\63"+
		"\3\2\2\2(\63\5\f\7\2)\63\5\16\b\2*+\5\20\t\2+,\7#\2\2,\63\3\2\2\2-.\5"+
		"\22\n\2./\7#\2\2/\63\3\2\2\2\60\63\5\24\13\2\61\63\7#\2\2\62\"\3\2\2\2"+
		"\62%\3\2\2\2\62(\3\2\2\2\62)\3\2\2\2\62*\3\2\2\2\62-\3\2\2\2\62\60\3\2"+
		"\2\2\62\61\3\2\2\2\63\5\3\2\2\2\64\65\5\b\5\2\658\7\f\2\2\66\67\7\24\2"+
		"\2\679\5\26\f\28\66\3\2\2\289\3\2\2\29\7\3\2\2\2:;\t\2\2\2;\t\3\2\2\2"+
		"<=\7\f\2\2=>\7\24\2\2>?\5\26\f\2?\13\3\2\2\2@A\7\7\2\2AB\7\37\2\2BC\5"+
		"\26\f\2CD\7 \2\2DN\5\24\13\2EF\7\b\2\2FG\7\7\2\2GH\7\37\2\2HI\5\26\f\2"+
		"IJ\7 \2\2JK\5\24\13\2KM\3\2\2\2LE\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2"+
		"\2OS\3\2\2\2PN\3\2\2\2QR\7\b\2\2RT\5\24\13\2SQ\3\2\2\2ST\3\2\2\2T\r\3"+
		"\2\2\2UV\7\t\2\2VY\7\37\2\2WZ\5\6\4\2XZ\5\n\6\2YW\3\2\2\2YX\3\2\2\2YZ"+
		"\3\2\2\2Z[\3\2\2\2[]\7#\2\2\\^\5\26\f\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2"+
		"_b\7#\2\2`c\5\n\6\2ac\5\22\n\2b`\3\2\2\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2"+
		"de\7 \2\2ef\5\24\13\2f\17\3\2\2\2gh\7\n\2\2hi\7\37\2\2ij\5\26\f\2jk\7"+
		" \2\2kl\7#\2\2l\21\3\2\2\2mn\7\f\2\2nr\7\20\2\2op\7\20\2\2pr\7\f\2\2q"+
		"m\3\2\2\2qo\3\2\2\2r\23\3\2\2\2sw\7!\2\2tv\5\4\3\2ut\3\2\2\2vy\3\2\2\2"+
		"wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\"\2\2{\25\3\2\2\2|}\b\f\1"+
		"\2}~\7\20\2\2~\u0086\5\26\f\n\177\u0080\7\37\2\2\u0080\u0081\5\26\f\2"+
		"\u0081\u0082\7 \2\2\u0082\u0086\3\2\2\2\u0083\u0086\7\f\2\2\u0084\u0086"+
		"\5\30\r\2\u0085|\3\2\2\2\u0085\177\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084"+
		"\3\2\2\2\u0086\u0097\3\2\2\2\u0087\u0088\f\t\2\2\u0088\u0089\t\3\2\2\u0089"+
		"\u0096\5\26\f\n\u008a\u008b\f\b\2\2\u008b\u008c\t\4\2\2\u008c\u0096\5"+
		"\26\f\t\u008d\u008e\f\7\2\2\u008e\u008f\t\5\2\2\u008f\u0096\5\26\f\b\u0090"+
		"\u0091\f\6\2\2\u0091\u0092\t\6\2\2\u0092\u0096\5\26\f\7\u0093\u0094\f"+
		"\13\2\2\u0094\u0096\7\20\2\2\u0095\u0087\3\2\2\2\u0095\u008a\3\2\2\2\u0095"+
		"\u008d\3\2\2\2\u0095\u0090\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\27\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009b\t\7\2\2\u009b\31\3\2\2\2\17\35\628NSY]bqw\u0085\u0095"+
		"\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}