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
		T__0=1, T__1=2, T__2=3, PAREOP=4, PARECL=5, LT=6, LE=7, GT=8, GE=9, ASSIGN=10, 
		EQUAL=11, NOTEQUAL=12, NOT=13, AND=14, OR=15, PLUS=16, MINUS=17, MUL=18, 
		DIV=19, VAR=20, INT=21, BOOL=22, CHAR=23, FLOAT=24, IF=25, THEN=26, ELSE=27, 
		ENDIF=28, WHILE=29, DO=30, ENDWHILE=31, FUNC=32, RETURN=33, ENDFUNC=34, 
		READ=35, WRITE=36, BOOLVAL=37, INTVAL=38, CHARVAL=39, FLOATVAL=40, ID=41, 
		STRING=42, COMMENT=43, WS=44;
	public static final int
		RULE_program = 0, RULE_function = 1, RULE_declarations = 2, RULE_variable_decl = 3, 
		RULE_param = 4, RULE_type = 5, RULE_statements = 6, RULE_statement = 7, 
		RULE_left_expr = 8, RULE_expr = 9, RULE_ident = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "function", "declarations", "variable_decl", "param", "type", 
			"statements", "statement", "left_expr", "expr", "ident"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "';'", "'('", "')'", "'<'", "'<='", "'>'", "'>='", 
			"'='", "'=='", "'!='", "'not'", "'and'", "'or'", "'+'", "'-'", "'*'", 
			"'/'", "'var'", "'int'", "'bool'", "'char'", "'float'", "'if'", "'then'", 
			"'else'", "'endif'", "'while'", "'do'", "'endwhile'", "'func'", "'return'", 
			"'endfunc'", "'read'", "'write'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "PAREOP", "PARECL", "LT", "LE", "GT", "GE", "ASSIGN", 
			"EQUAL", "NOTEQUAL", "NOT", "AND", "OR", "PLUS", "MINUS", "MUL", "DIV", 
			"VAR", "INT", "BOOL", "CHAR", "FLOAT", "IF", "THEN", "ELSE", "ENDIF", 
			"WHILE", "DO", "ENDWHILE", "FUNC", "RETURN", "ENDFUNC", "READ", "WRITE", 
			"BOOLVAL", "INTVAL", "CHARVAL", "FLOATVAL", "ID", "STRING", "COMMENT", 
			"WS"
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
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				function();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNC );
			setState(27);
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
		public TypeContext basic_type;
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
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(FUNC);
			setState(30);
			match(ID);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(31);
				match(T__0);
				setState(32);
				((FunctionContext)_localctx).basic_type = type();
				}
			}

			setState(35);
			match(PAREOP);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(36);
				param();
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(37);
					match(T__1);
					setState(38);
					param();
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(46);
			match(PARECL);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(47);
				match(T__0);
				setState(48);
				type();
				}
			}

			setState(51);
			declarations();
			setState(52);
			statements();
			setState(53);
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
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(55);
				variable_decl();
				}
				}
				setState(60);
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
		public List<TerminalNode> ID() { return getTokens(AslParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AslParser.ID, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(VAR);
			setState(62);
			match(ID);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(63);
				match(T__1);
				setState(64);
				match(ID);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(T__0);
			setState(71);
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AslParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(ID);
			setState(74);
			match(T__0);
			setState(75);
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
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
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
		enterRule(_localctx, 12, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << ID))) != 0)) {
				{
				{
				setState(79);
				statement();
				}
				}
				setState(84);
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
	public static class WhileStmtContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(AslParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(AslParser.DO, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode ENDWHILE() { return getToken(AslParser.ENDWHILE, 0); }
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class IfStmtContext extends StatementContext {
		public TerminalNode IF() { return getToken(AslParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(AslParser.THEN, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(AslParser.ENDIF, 0); }
		public TerminalNode ELSE() { return getToken(AslParser.ELSE, 0); }
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
	public static class ReturnContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(AslParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AssignStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				left_expr();
				setState(86);
				match(ASSIGN);
				setState(87);
				expr(0);
				setState(88);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(IF);
				setState(91);
				expr(0);
				setState(92);
				match(THEN);
				setState(93);
				statements();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(94);
					match(ELSE);
					setState(95);
					statements();
					}
				}

				setState(98);
				match(ENDIF);
				}
				break;
			case 3:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(WHILE);
				setState(101);
				expr(0);
				setState(102);
				match(DO);
				setState(103);
				statements();
				setState(104);
				match(ENDWHILE);
				}
				break;
			case 4:
				_localctx = new ProcCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				ident();
				setState(107);
				match(PAREOP);
				setState(108);
				match(PARECL);
				setState(109);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new ReadStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				match(READ);
				setState(112);
				left_expr();
				setState(113);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new WriteExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				match(WRITE);
				setState(116);
				expr(0);
				setState(117);
				match(T__2);
				}
				break;
			case 7:
				_localctx = new WriteStringContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				match(WRITE);
				setState(120);
				match(STRING);
				setState(121);
				match(T__2);
				}
				break;
			case 8:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(122);
				match(RETURN);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAREOP) | (1L << NOT) | (1L << PLUS) | (1L << MINUS) | (1L << BOOLVAL) | (1L << INTVAL) | (1L << CHARVAL) | (1L << FLOATVAL) | (1L << ID))) != 0)) {
					{
					setState(123);
					expr(0);
					}
				}

				setState(126);
				match(T__2);
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
		enterRule(_localctx, 16, RULE_left_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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
	public static class OrContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(AslParser.OR, 0); }
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AndContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(AslParser.AND, 0); }
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
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
		public TerminalNode NOTEQUAL() { return getToken(AslParser.NOTEQUAL, 0); }
		public TerminalNode GT() { return getToken(AslParser.GT, 0); }
		public TerminalNode GE() { return getToken(AslParser.GE, 0); }
		public TerminalNode LT() { return getToken(AslParser.LT, 0); }
		public TerminalNode LE() { return getToken(AslParser.LE, 0); }
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case PLUS:
			case MINUS:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MINUS:
					{
					setState(132);
					((UnaryContext)_localctx).op = match(MINUS);
					}
					break;
				case PLUS:
					{
					setState(133);
					((UnaryContext)_localctx).op = match(PLUS);
					}
					break;
				case NOT:
					{
					setState(134);
					((UnaryContext)_localctx).op = match(NOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(137);
				expr(9);
				}
				break;
			case PAREOP:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(PAREOP);
				setState(139);
				expr(0);
				setState(140);
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
				setState(142);
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
				setState(143);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(174);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(149);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MUL:
							{
							setState(147);
							((ArithmeticContext)_localctx).op = match(MUL);
							}
							break;
						case DIV:
							{
							setState(148);
							((ArithmeticContext)_localctx).op = match(DIV);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(151);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(152);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(155);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(153);
							((ArithmeticContext)_localctx).op = match(PLUS);
							}
							break;
						case MINUS:
							{
							setState(154);
							((ArithmeticContext)_localctx).op = match(MINUS);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(157);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(158);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(165);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case EQUAL:
							{
							setState(159);
							((RelationalContext)_localctx).op = match(EQUAL);
							}
							break;
						case NOTEQUAL:
							{
							setState(160);
							((RelationalContext)_localctx).op = match(NOTEQUAL);
							}
							break;
						case GT:
							{
							setState(161);
							((RelationalContext)_localctx).op = match(GT);
							}
							break;
						case GE:
							{
							setState(162);
							((RelationalContext)_localctx).op = match(GE);
							}
							break;
						case LT:
							{
							setState(163);
							((RelationalContext)_localctx).op = match(LT);
							}
							break;
						case LE:
							{
							setState(164);
							((RelationalContext)_localctx).op = match(LE);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(167);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(168);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(169);
						((AndContext)_localctx).op = match(AND);
						}
						setState(170);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(171);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(172);
						((OrContext)_localctx).op = match(OR);
						}
						setState(173);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 20, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		case 9:
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
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00b8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\2\3\2\3\3\3\3\3\3\3\3\5\3$\n"+
		"\3\3\3\3\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\5\3/\n\3\3\3\3\3\3\3\5\3\64"+
		"\n\3\3\3\3\3\3\3\3\3\3\4\7\4;\n\4\f\4\16\4>\13\4\3\5\3\5\3\5\3\5\7\5D"+
		"\n\5\f\5\16\5G\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\7\bS\n\b\f"+
		"\b\16\bV\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tc\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\177\n\t\3\t\5\t\u0082\n\t\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\5\13\u008a\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0093\n\13\3\13\3\13\3\13\5\13\u0098\n\13\3\13\3\13\3\13\3\13\5"+
		"\13\u009e\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a8\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b1\n\13\f\13\16\13\u00b4\13"+
		"\13\3\f\3\f\3\f\2\3\24\r\2\4\6\b\n\f\16\20\22\24\26\2\4\3\2\27\32\3\2"+
		"\'*\2\u00ce\2\31\3\2\2\2\4\37\3\2\2\2\6<\3\2\2\2\b?\3\2\2\2\nK\3\2\2\2"+
		"\fO\3\2\2\2\16T\3\2\2\2\20\u0081\3\2\2\2\22\u0083\3\2\2\2\24\u0092\3\2"+
		"\2\2\26\u00b5\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31"+
		"\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36\7\2\2\3\36\3\3\2\2\2\37 \7"+
		"\"\2\2 #\7+\2\2!\"\7\3\2\2\"$\5\f\7\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%."+
		"\7\6\2\2&+\5\n\6\2\'(\7\4\2\2(*\5\n\6\2)\'\3\2\2\2*-\3\2\2\2+)\3\2\2\2"+
		"+,\3\2\2\2,/\3\2\2\2-+\3\2\2\2.&\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\63\7"+
		"\7\2\2\61\62\7\3\2\2\62\64\5\f\7\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3"+
		"\2\2\2\65\66\5\6\4\2\66\67\5\16\b\2\678\7$\2\28\5\3\2\2\29;\5\b\5\2:9"+
		"\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\7\3\2\2\2><\3\2\2\2?@\7\26\2\2"+
		"@E\7+\2\2AB\7\4\2\2BD\7+\2\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F"+
		"H\3\2\2\2GE\3\2\2\2HI\7\3\2\2IJ\5\f\7\2J\t\3\2\2\2KL\7+\2\2LM\7\3\2\2"+
		"MN\5\f\7\2N\13\3\2\2\2OP\t\2\2\2P\r\3\2\2\2QS\5\20\t\2RQ\3\2\2\2SV\3\2"+
		"\2\2TR\3\2\2\2TU\3\2\2\2U\17\3\2\2\2VT\3\2\2\2WX\5\22\n\2XY\7\f\2\2YZ"+
		"\5\24\13\2Z[\7\5\2\2[\u0082\3\2\2\2\\]\7\33\2\2]^\5\24\13\2^_\7\34\2\2"+
		"_b\5\16\b\2`a\7\35\2\2ac\5\16\b\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\36"+
		"\2\2e\u0082\3\2\2\2fg\7\37\2\2gh\5\24\13\2hi\7 \2\2ij\5\16\b\2jk\7!\2"+
		"\2k\u0082\3\2\2\2lm\5\26\f\2mn\7\6\2\2no\7\7\2\2op\7\5\2\2p\u0082\3\2"+
		"\2\2qr\7%\2\2rs\5\22\n\2st\7\5\2\2t\u0082\3\2\2\2uv\7&\2\2vw\5\24\13\2"+
		"wx\7\5\2\2x\u0082\3\2\2\2yz\7&\2\2z{\7,\2\2{\u0082\7\5\2\2|~\7#\2\2}\177"+
		"\5\24\13\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\7\5\2"+
		"\2\u0081W\3\2\2\2\u0081\\\3\2\2\2\u0081f\3\2\2\2\u0081l\3\2\2\2\u0081"+
		"q\3\2\2\2\u0081u\3\2\2\2\u0081y\3\2\2\2\u0081|\3\2\2\2\u0082\21\3\2\2"+
		"\2\u0083\u0084\5\26\f\2\u0084\23\3\2\2\2\u0085\u0089\b\13\1\2\u0086\u008a"+
		"\7\23\2\2\u0087\u008a\7\22\2\2\u0088\u008a\7\17\2\2\u0089\u0086\3\2\2"+
		"\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0093"+
		"\5\24\13\13\u008c\u008d\7\6\2\2\u008d\u008e\5\24\13\2\u008e\u008f\7\7"+
		"\2\2\u008f\u0093\3\2\2\2\u0090\u0093\t\3\2\2\u0091\u0093\5\26\f\2\u0092"+
		"\u0085\3\2\2\2\u0092\u008c\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2"+
		"\2\2\u0093\u00b2\3\2\2\2\u0094\u0097\f\t\2\2\u0095\u0098\7\24\2\2\u0096"+
		"\u0098\7\25\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3"+
		"\2\2\2\u0099\u00b1\5\24\13\n\u009a\u009d\f\b\2\2\u009b\u009e\7\22\2\2"+
		"\u009c\u009e\7\23\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00b1\5\24\13\t\u00a0\u00a7\f\7\2\2\u00a1\u00a8\7\r\2\2"+
		"\u00a2\u00a8\7\16\2\2\u00a3\u00a8\7\n\2\2\u00a4\u00a8\7\13\2\2\u00a5\u00a8"+
		"\7\b\2\2\u00a6\u00a8\7\t\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a7"+
		"\u00a3\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00b1\5\24\13\b\u00aa\u00ab\f\6\2\2\u00ab"+
		"\u00ac\7\20\2\2\u00ac\u00b1\5\24\13\7\u00ad\u00ae\f\5\2\2\u00ae\u00af"+
		"\7\21\2\2\u00af\u00b1\5\24\13\6\u00b0\u0094\3\2\2\2\u00b0\u009a\3\2\2"+
		"\2\u00b0\u00a0\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b1\u00b4"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\25\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b6\7+\2\2\u00b6\27\3\2\2\2\24\33#+.\63<ETb~\u0081"+
		"\u0089\u0092\u0097\u009d\u00a7\u00b0\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}