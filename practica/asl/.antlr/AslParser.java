// Generated from /home/jeremy/Escritorio/ASL-A-Simple-Language-Compiler/practica/asl/Asl.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AslParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, PAREOP=3, PARECL=4, LT=5, LE=6, GT=7, GE=8, ASSIGN=9, 
		EQUAL=10, NOTEQUAL=11, NOT=12, AND=13, OR=14, PLUS=15, MINUS=16, MUL=17, 
		DIV=18, VAR=19, INT=20, BOOL=21, CHAR=22, FLOAT=23, IF=24, THEN=25, ELSE=26, 
		ENDIF=27, FUNC=28, ENDFUNC=29, READ=30, WRITE=31, BOOLVAL=32, INTVAL=33, 
		CHARVAL=34, FLOATVAL=35, ID=36, STRING=37, COMMENT=38, WS=39;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_declarations = 2, RULE_variable_decl = 3, 
		RULE_type = 4, RULE_statements = 5, RULE_statement = 6, RULE_left_expr = 7, 
		RULE_expr = 8, RULE_ident = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "declarations", "variable_decl", "type", "statements", 
			"statement", "left_expr", "expr", "ident"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "';'", "'('", "')'", "'<'", "'<='", "'>'", "'>='", "'='", 
			"'=='", "'!='", "'not'", "'and'", "'or'", "'+'", "'-'", "'*'", "'/'", 
			"'var'", "'int'", "'bool'", "'char'", "'float'", "'if'", "'then'", "'else'", 
			"'endif'", "'func'", "'endfunc'", "'read'", "'write'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "PAREOP", "PARECL", "LT", "LE", "GT", "GE", "ASSIGN", 
			"EQUAL", "NOTEQUAL", "NOT", "AND", "OR", "PLUS", "MINUS", "MUL", "DIV", 
			"VAR", "INT", "BOOL", "CHAR", "FLOAT", "IF", "THEN", "ELSE", "ENDIF", 
			"FUNC", "ENDFUNC", "READ", "WRITE", "BOOLVAL", "INTVAL", "CHARVAL", "FLOATVAL", 
			"ID", "STRING", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Asl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AslParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AslParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				function();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNC );
			setState(25);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(AslParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(AslParser.ID, 0); }
		public TerminalNode PAREOP() { return getToken(AslParser.PAREOP, 0); }
		public TerminalNode PARECL() { return getToken(AslParser.PARECL, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ENDFUNC() { return getToken(AslParser.ENDFUNC, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(FUNC);
			setState(28);
			match(ID);
			setState(29);
			match(PAREOP);
			setState(30);
			match(PARECL);
			setState(31);
			declarations();
			setState(32);
			statements();
			setState(33);
			match(ENDFUNC);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public List<Variable_declContext> variable_decl() {
			return getRuleContexts(Variable_declContext.class);
		}
		public Variable_declContext variable_decl(int i) {
			return getRuleContext(Variable_declContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(35);
				variable_decl();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Variable_declContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(AslParser.VAR, 0); }
		public TerminalNode ID() { return getToken(AslParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Variable_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_decl; }
	}

	public final Variable_declContext variable_decl() throws RecognitionException {
		Variable_declContext _localctx = new Variable_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(VAR);
			setState(42);
			match(ID);
			setState(43);
			match(T__0);
			setState(44);
			type();
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
		public TerminalNode INT() { return getToken(AslParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(AslParser.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(AslParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(AslParser.CHAR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << CHAR) | (1L << FLOAT))) != 0)) ) {
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << READ) | (1L << WRITE) | (1L << ID))) != 0)) {
				{
				{
				setState(48);
				statement();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProcCallContext extends StatementContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode PAREOP() { return getToken(AslParser.PAREOP, 0); }
		public TerminalNode PARECL() { return getToken(AslParser.PARECL, 0); }
		public ProcCallContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class WriteExprContext extends StatementContext {
		public TerminalNode WRITE() { return getToken(AslParser.WRITE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WriteExprContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class IfStmtContext extends StatementContext {
		public TerminalNode IF() { return getToken(AslParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(AslParser.THEN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(AslParser.ENDIF, 0); }
		public IfStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ReadStmtContext extends StatementContext {
		public TerminalNode READ() { return getToken(AslParser.READ, 0); }
		public Left_exprContext left_expr() {
			return getRuleContext(Left_exprContext.class,0);
		}
		public ReadStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class AssignStmtContext extends StatementContext {
		public Left_exprContext left_expr() {
			return getRuleContext(Left_exprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AslParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class WriteStringContext extends StatementContext {
		public TerminalNode WRITE() { return getToken(AslParser.WRITE, 0); }
		public TerminalNode STRING() { return getToken(AslParser.STRING, 0); }
		public WriteStringContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				left_expr();
				setState(55);
				match(ASSIGN);
				setState(56);
				expr(0);
				setState(57);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(IF);
				setState(60);
				expr(0);
				setState(61);
				match(THEN);
				setState(62);
				statements();
				setState(63);
				match(ENDIF);
				}
				break;
			case 3:
				_localctx = new ProcCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				ident();
				setState(66);
				match(PAREOP);
				setState(67);
				match(PARECL);
				setState(68);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new ReadStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				match(READ);
				setState(71);
				left_expr();
				setState(72);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new WriteExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				match(WRITE);
				setState(75);
				expr(0);
				setState(76);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new WriteStringContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				match(WRITE);
				setState(79);
				match(STRING);
				setState(80);
				match(T__1);
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

	public static class Left_exprContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Left_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_expr; }
	}

	public final Left_exprContext left_expr() throws RecognitionException {
		Left_exprContext _localctx = new Left_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_left_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			ident();
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
	public static class ExprIdentContext extends ExprContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExprIdentContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ArithmeticContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(AslParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(AslParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(AslParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AslParser.MINUS, 0); }
		public ArithmeticContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class RelationalContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(AslParser.EQUAL, 0); }
		public RelationalContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(AslParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(AslParser.PLUS, 0); }
		public TerminalNode NOT() { return getToken(AslParser.NOT, 0); }
		public UnaryContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesisContext extends ExprContext {
		public TerminalNode PAREOP() { return getToken(AslParser.PAREOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARECL() { return getToken(AslParser.PARECL, 0); }
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ValueContext extends ExprContext {
		public TerminalNode INTVAL() { return getToken(AslParser.INTVAL, 0); }
		public TerminalNode BOOLVAL() { return getToken(AslParser.BOOLVAL, 0); }
		public TerminalNode FLOATVAL() { return getToken(AslParser.FLOATVAL, 0); }
		public TerminalNode CHARVAL() { return getToken(AslParser.CHARVAL, 0); }
		public ValueContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case PLUS:
			case MINUS:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(89);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MINUS:
					{
					setState(86);
					((UnaryContext)_localctx).op = match(MINUS);
					}
					break;
				case PLUS:
					{
					setState(87);
					((UnaryContext)_localctx).op = match(PLUS);
					}
					break;
				case NOT:
					{
					setState(88);
					((UnaryContext)_localctx).op = match(NOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(91);
				expr(7);
				}
				break;
			case PAREOP:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(PAREOP);
				setState(93);
				expr(0);
				setState(94);
				match(PARECL);
				}
				break;
			case BOOLVAL:
			case INTVAL:
			case CHARVAL:
			case FLOATVAL:
				{
				_localctx = new ValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLVAL) | (1L << INTVAL) | (1L << CHARVAL) | (1L << FLOATVAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				{
				_localctx = new ExprIdentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(115);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(103);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MUL:
							{
							setState(101);
							((ArithmeticContext)_localctx).op = match(MUL);
							}
							break;
						case DIV:
							{
							setState(102);
							((ArithmeticContext)_localctx).op = match(DIV);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(105);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(109);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(107);
							((ArithmeticContext)_localctx).op = match(PLUS);
							}
							break;
						case MINUS:
							{
							setState(108);
							((ArithmeticContext)_localctx).op = match(MINUS);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(111);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(112);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(113);
						((RelationalContext)_localctx).op = match(EQUAL);
						}
						setState(114);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AslParser.ID, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(ID);
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
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)}\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2"+
		"\6\2\30\n\2\r\2\16\2\31\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\7"+
		"\4\'\n\4\f\4\16\4*\13\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\7\7\64\n\7\f\7"+
		"\16\7\67\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bT\n\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\5\n\\\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\ne\n\n\3\n\3"+
		"\n\3\n\5\nj\n\n\3\n\3\n\3\n\3\n\5\np\n\n\3\n\3\n\3\n\3\n\7\nv\n\n\f\n"+
		"\16\ny\13\n\3\13\3\13\3\13\2\3\22\f\2\4\6\b\n\f\16\20\22\24\2\4\3\2\26"+
		"\31\3\2\"%\2\u0084\2\27\3\2\2\2\4\35\3\2\2\2\6(\3\2\2\2\b+\3\2\2\2\n\60"+
		"\3\2\2\2\f\65\3\2\2\2\16S\3\2\2\2\20U\3\2\2\2\22d\3\2\2\2\24z\3\2\2\2"+
		"\26\30\5\4\3\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2"+
		"\32\33\3\2\2\2\33\34\7\2\2\3\34\3\3\2\2\2\35\36\7\36\2\2\36\37\7&\2\2"+
		"\37 \7\5\2\2 !\7\6\2\2!\"\5\6\4\2\"#\5\f\7\2#$\7\37\2\2$\5\3\2\2\2%\'"+
		"\5\b\5\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\7\3\2\2\2*(\3\2\2\2"+
		"+,\7\25\2\2,-\7&\2\2-.\7\3\2\2./\5\n\6\2/\t\3\2\2\2\60\61\t\2\2\2\61\13"+
		"\3\2\2\2\62\64\5\16\b\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66"+
		"\3\2\2\2\66\r\3\2\2\2\67\65\3\2\2\289\5\20\t\29:\7\13\2\2:;\5\22\n\2;"+
		"<\7\4\2\2<T\3\2\2\2=>\7\32\2\2>?\5\22\n\2?@\7\33\2\2@A\5\f\7\2AB\7\35"+
		"\2\2BT\3\2\2\2CD\5\24\13\2DE\7\5\2\2EF\7\6\2\2FG\7\4\2\2GT\3\2\2\2HI\7"+
		" \2\2IJ\5\20\t\2JK\7\4\2\2KT\3\2\2\2LM\7!\2\2MN\5\22\n\2NO\7\4\2\2OT\3"+
		"\2\2\2PQ\7!\2\2QR\7\'\2\2RT\7\4\2\2S8\3\2\2\2S=\3\2\2\2SC\3\2\2\2SH\3"+
		"\2\2\2SL\3\2\2\2SP\3\2\2\2T\17\3\2\2\2UV\5\24\13\2V\21\3\2\2\2W[\b\n\1"+
		"\2X\\\7\22\2\2Y\\\7\21\2\2Z\\\7\16\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\"+
		"]\3\2\2\2]e\5\22\n\t^_\7\5\2\2_`\5\22\n\2`a\7\6\2\2ae\3\2\2\2be\t\3\2"+
		"\2ce\5\24\13\2dW\3\2\2\2d^\3\2\2\2db\3\2\2\2dc\3\2\2\2ew\3\2\2\2fi\f\7"+
		"\2\2gj\7\23\2\2hj\7\24\2\2ig\3\2\2\2ih\3\2\2\2jk\3\2\2\2kv\5\22\n\blo"+
		"\f\6\2\2mp\7\21\2\2np\7\22\2\2om\3\2\2\2on\3\2\2\2pq\3\2\2\2qv\5\22\n"+
		"\7rs\f\5\2\2st\7\f\2\2tv\5\22\n\6uf\3\2\2\2ul\3\2\2\2ur\3\2\2\2vy\3\2"+
		"\2\2wu\3\2\2\2wx\3\2\2\2x\23\3\2\2\2yw\3\2\2\2z{\7&\2\2{\25\3\2\2\2\f"+
		"\31(\65S[diouw";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}