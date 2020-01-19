// Generated from /Users/yanbezborodov/projects/translation_methods/hw3/MyLang.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, EQ=2, NON_EQ=3, LOWER_EQ=4, GREATER_EQ=5, TRUE=6, FALSE=7, INT=8, 
		DOUBLE=9, FLOAT=10, STRING=11, LONG=12, CHAR=13, BOOL=14, VOID=15, RETURN=16, 
		IF=17, ELSE=18, DEF=19, PLUS=20, MINUS=21, MUL=22, DIV=23, MOD=24, OR=25, 
		AND=26, NOT=27, LOWER=28, GREATER=29, ASSIGN=30, R_PAR=31, L_PAR=32, L_BRACE=33, 
		R_BRACE=34, R_BRACK=35, FOR=36, WHILE=37, L_BRACK=38, SEMICOLON=39, COLON=40, 
		STRING_=41, ID=42, NUM=43, COMMA=44;
	public static final int
		RULE_main = 0, RULE_code = 1, RULE_global_statement = 2, RULE_var_decl = 3, 
		RULE_var_def = 4, RULE_function = 5, RULE_function_args = 6, RULE_function_args_ = 7, 
		RULE_body = 8, RULE_local_statement = 9, RULE_function_call = 10, RULE_exp_list = 11, 
		RULE_exp_list_ = 12, RULE_cycle = 13, RULE_for_statement = 14, RULE_while_statement = 15, 
		RULE_if_statement = 16, RULE_type_ = 17, RULE_array_type = 18, RULE_basic_type = 19, 
		RULE_returned_type = 20, RULE_assigment_statement = 21, RULE_atom = 22, 
		RULE_exp = 23, RULE_p0 = 24, RULE_p6 = 25;
	public static final String[] ruleNames = {
		"main", "code", "global_statement", "var_decl", "var_def", "function", 
		"function_args", "function_args_", "body", "local_statement", "function_call", 
		"exp_list", "exp_list_", "cycle", "for_statement", "while_statement", 
		"if_statement", "type_", "array_type", "basic_type", "returned_type", 
		"assigment_statement", "atom", "exp", "p0", "p6"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'=='", "'!='", "'<='", "'>='", "'true'", "'false'", "'int'", 
		"'double'", "'float'", "'string'", "'long'", "'char'", "'bool'", "'void'", 
		"'return'", "'if'", "'else'", "'def'", "'+'", "'-'", "'*'", "'/'", "'mod'", 
		"'or'", "'and'", "'not'", "'<'", "'>'", "':='", "')'", "'('", "'{'", "'}'", 
		"']'", "'for'", "'while'", "'['", "';'", "':'", null, null, null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "EQ", "NON_EQ", "LOWER_EQ", "GREATER_EQ", "TRUE", "FALSE", 
		"INT", "DOUBLE", "FLOAT", "STRING", "LONG", "CHAR", "BOOL", "VOID", "RETURN", 
		"IF", "ELSE", "DEF", "PLUS", "MINUS", "MUL", "DIV", "MOD", "OR", "AND", 
		"NOT", "LOWER", "GREATER", "ASSIGN", "R_PAR", "L_PAR", "L_BRACE", "R_BRACE", 
		"R_BRACK", "FOR", "WHILE", "L_BRACK", "SEMICOLON", "COLON", "STRING_", 
		"ID", "NUM", "COMMA"
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

	@Override
	public String getGrammarFileName() { return "MyLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MyLangParser.EOF, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			code();
			setState(53);
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

	public static class CodeContext extends ParserRuleContext {
		public Global_statementContext global_statement() {
			return getRuleContext(Global_statementContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				global_statement();
				setState(56);
				code();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Global_statementContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MyLangParser.SEMICOLON, 0); }
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Global_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_statement; }
	}

	public final Global_statementContext global_statement() throws RecognitionException {
		Global_statementContext _localctx = new Global_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_global_statement);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				var_decl();
				setState(62);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				var_def();
				setState(65);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				function();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				function_call();
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

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLangParser.ID, 0); }
		public TerminalNode COLON() { return getToken(MyLangParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ID);
			setState(72);
			match(COLON);
			setState(73);
			type_();
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

	public static class Var_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLangParser.ID, 0); }
		public TerminalNode COLON() { return getToken(MyLangParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MyLangParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ID);
			setState(76);
			match(COLON);
			setState(77);
			type_();
			setState(78);
			match(ASSIGN);
			setState(79);
			exp(0);
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
		public TerminalNode DEF() { return getToken(MyLangParser.DEF, 0); }
		public TerminalNode ID() { return getToken(MyLangParser.ID, 0); }
		public TerminalNode L_PAR() { return getToken(MyLangParser.L_PAR, 0); }
		public Function_argsContext function_args() {
			return getRuleContext(Function_argsContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(MyLangParser.R_PAR, 0); }
		public TerminalNode COLON() { return getToken(MyLangParser.COLON, 0); }
		public Returned_typeContext returned_type() {
			return getRuleContext(Returned_typeContext.class,0);
		}
		public TerminalNode L_BRACE() { return getToken(MyLangParser.L_BRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(MyLangParser.R_BRACE, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(DEF);
			setState(82);
			match(ID);
			setState(83);
			match(L_PAR);
			setState(84);
			function_args();
			setState(85);
			match(R_PAR);
			setState(86);
			match(COLON);
			setState(87);
			returned_type();
			setState(88);
			match(L_BRACE);
			setState(89);
			body();
			setState(90);
			match(R_BRACE);
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

	public static class Function_argsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLangParser.ID, 0); }
		public TerminalNode COLON() { return getToken(MyLangParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Function_args_Context function_args_() {
			return getRuleContext(Function_args_Context.class,0);
		}
		public Function_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_args; }
	}

	public final Function_argsContext function_args() throws RecognitionException {
		Function_argsContext _localctx = new Function_argsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_args);
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(ID);
				setState(93);
				match(COLON);
				setState(94);
				type_();
				setState(95);
				function_args_();
				}
				break;
			case R_PAR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Function_args_Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MyLangParser.COMMA, 0); }
		public TerminalNode ID() { return getToken(MyLangParser.ID, 0); }
		public TerminalNode COLON() { return getToken(MyLangParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Function_args_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_args_; }
	}

	public final Function_args_Context function_args_() throws RecognitionException {
		Function_args_Context _localctx = new Function_args_Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_args_);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(COMMA);
				setState(101);
				match(ID);
				setState(102);
				match(COLON);
				setState(103);
				type_();
				}
				break;
			case R_PAR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class BodyContext extends ParserRuleContext {
		public Local_statementContext local_statement() {
			return getRuleContext(Local_statementContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_body);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case RETURN:
			case IF:
			case PLUS:
			case MINUS:
			case NOT:
			case L_PAR:
			case FOR:
			case WHILE:
			case STRING_:
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				local_statement();
				setState(108);
				body();
				}
				break;
			case L_BRACE:
			case R_BRACE:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Local_statementContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MyLangParser.SEMICOLON, 0); }
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public CycleContext cycle() {
			return getRuleContext(CycleContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(MyLangParser.RETURN, 0); }
		public Local_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_local_statement; }
	}

	public final Local_statementContext local_statement() throws RecognitionException {
		Local_statementContext _localctx = new Local_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_local_statement);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				var_decl();
				setState(114);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				var_def();
				setState(117);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				cycle();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				exp(0);
				setState(122);
				match(SEMICOLON);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				match(RETURN);
				setState(125);
				exp(0);
				setState(126);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(128);
				match(RETURN);
				setState(129);
				match(SEMICOLON);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLangParser.ID, 0); }
		public TerminalNode L_PAR() { return getToken(MyLangParser.L_PAR, 0); }
		public Exp_listContext exp_list() {
			return getRuleContext(Exp_listContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(MyLangParser.R_PAR, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(ID);
			setState(133);
			match(L_PAR);
			setState(134);
			exp_list();
			setState(135);
			match(R_PAR);
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

	public static class Exp_listContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp_list_Context exp_list_() {
			return getRuleContext(Exp_list_Context.class,0);
		}
		public Exp_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_list; }
	}

	public final Exp_listContext exp_list() throws RecognitionException {
		Exp_listContext _localctx = new Exp_listContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_exp_list);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
			case PLUS:
			case MINUS:
			case NOT:
			case L_PAR:
			case STRING_:
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				exp(0);
				setState(138);
				exp_list_();
				}
				break;
			case R_PAR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Exp_list_Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(MyLangParser.COMMA, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp_list_Context exp_list_() {
			return getRuleContext(Exp_list_Context.class,0);
		}
		public Exp_list_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_list_; }
	}

	public final Exp_list_Context exp_list_() throws RecognitionException {
		Exp_list_Context _localctx = new Exp_list_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_exp_list_);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(COMMA);
				setState(144);
				exp(0);
				setState(145);
				exp_list_();
				}
				break;
			case R_PAR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CycleContext extends ParserRuleContext {
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public CycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cycle; }
	}

	public final CycleContext cycle() throws RecognitionException {
		CycleContext _localctx = new CycleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cycle);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				for_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				while_statement();
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MyLangParser.FOR, 0); }
		public TerminalNode L_PAR() { return getToken(MyLangParser.L_PAR, 0); }
		public Var_defContext var_def() {
			return getRuleContext(Var_defContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MyLangParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MyLangParser.SEMICOLON, i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode R_PAR() { return getToken(MyLangParser.R_PAR, 0); }
		public List<TerminalNode> L_BRACE() { return getTokens(MyLangParser.L_BRACE); }
		public TerminalNode L_BRACE(int i) {
			return getToken(MyLangParser.L_BRACE, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(FOR);
			setState(155);
			match(L_PAR);
			setState(156);
			var_def();
			setState(157);
			match(SEMICOLON);
			setState(158);
			exp(0);
			setState(159);
			match(SEMICOLON);
			setState(160);
			exp(0);
			setState(161);
			match(R_PAR);
			setState(162);
			match(L_BRACE);
			setState(163);
			body();
			setState(164);
			match(L_BRACE);
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MyLangParser.WHILE, 0); }
		public TerminalNode L_PAR() { return getToken(MyLangParser.L_PAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(MyLangParser.R_PAR, 0); }
		public TerminalNode L_BRACE() { return getToken(MyLangParser.L_BRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(MyLangParser.R_BRACE, 0); }
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(WHILE);
			setState(167);
			match(L_PAR);
			setState(168);
			exp(0);
			setState(169);
			match(R_PAR);
			setState(170);
			match(L_BRACE);
			setState(171);
			body();
			setState(172);
			match(R_BRACE);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MyLangParser.IF, 0); }
		public TerminalNode L_PAR() { return getToken(MyLangParser.L_PAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(MyLangParser.R_PAR, 0); }
		public TerminalNode L_BRACE() { return getToken(MyLangParser.L_BRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(MyLangParser.R_BRACE, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(IF);
			setState(175);
			match(L_PAR);
			setState(176);
			exp(0);
			setState(177);
			match(R_PAR);
			setState(178);
			match(L_BRACE);
			setState(179);
			body();
			setState(180);
			match(R_BRACE);
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

	public static class Type_Context extends ParserRuleContext {
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_type_);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				basic_type();
				setState(183);
				array_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				basic_type();
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

	public static class Array_typeContext extends ParserRuleContext {
		public TerminalNode L_BRACK() { return getToken(MyLangParser.L_BRACK, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode R_BRACK() { return getToken(MyLangParser.R_BRACK, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_array_type);
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(L_BRACK);
				setState(189);
				exp(0);
				setState(190);
				match(R_BRACK);
				setState(191);
				array_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Basic_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MyLangParser.INT, 0); }
		public TerminalNode LONG() { return getToken(MyLangParser.LONG, 0); }
		public TerminalNode DOUBLE() { return getToken(MyLangParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(MyLangParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(MyLangParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(MyLangParser.BOOL, 0); }
		public Basic_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_type; }
	}

	public final Basic_typeContext basic_type() throws RecognitionException {
		Basic_typeContext _localctx = new Basic_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_basic_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT) | (1L << LONG) | (1L << CHAR) | (1L << BOOL))) != 0)) ) {
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

	public static class Returned_typeContext extends ParserRuleContext {
		public Basic_typeContext basic_type() {
			return getRuleContext(Basic_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(MyLangParser.VOID, 0); }
		public Returned_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returned_type; }
	}

	public final Returned_typeContext returned_type() throws RecognitionException {
		Returned_typeContext _localctx = new Returned_typeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_returned_type);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case FLOAT:
			case LONG:
			case CHAR:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				basic_type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(VOID);
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

	public static class Assigment_statementContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MyLangParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Assigment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment_statement; }
	}

	public final Assigment_statementContext assigment_statement() throws RecognitionException {
		Assigment_statementContext _localctx = new Assigment_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assigment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			atom();
			setState(203);
			match(ASSIGN);
			setState(204);
			exp(0);
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyLangParser.ID, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atom);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(ID);
				setState(208);
				array_type();
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

	public static class ExpContext extends ParserRuleContext {
		public P0Context p0() {
			return getRuleContext(P0Context.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MyLangParser.ASSIGN, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(212);
			p0(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(214);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(215);
					match(ASSIGN);
					setState(216);
					p0(0);
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class P0Context extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MyLangParser.PLUS, 0); }
		public P6Context p6() {
			return getRuleContext(P6Context.class,0);
		}
		public TerminalNode MINUS() { return getToken(MyLangParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(MyLangParser.NOT, 0); }
		public P0Context p0() {
			return getRuleContext(P0Context.class,0);
		}
		public TerminalNode OR() { return getToken(MyLangParser.OR, 0); }
		public TerminalNode AND() { return getToken(MyLangParser.AND, 0); }
		public TerminalNode EQ() { return getToken(MyLangParser.EQ, 0); }
		public TerminalNode NON_EQ() { return getToken(MyLangParser.NON_EQ, 0); }
		public TerminalNode LOWER_EQ() { return getToken(MyLangParser.LOWER_EQ, 0); }
		public TerminalNode GREATER_EQ() { return getToken(MyLangParser.GREATER_EQ, 0); }
		public TerminalNode LOWER() { return getToken(MyLangParser.LOWER, 0); }
		public TerminalNode GREATER() { return getToken(MyLangParser.GREATER, 0); }
		public TerminalNode MUL() { return getToken(MyLangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MyLangParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MyLangParser.MOD, 0); }
		public P0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p0; }
	}

	public final P0Context p0() throws RecognitionException {
		return p0(0);
	}

	private P0Context p0(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		P0Context _localctx = new P0Context(_ctx, _parentState);
		P0Context _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_p0, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				{
				setState(223);
				match(PLUS);
				setState(224);
				p6();
				}
				break;
			case MINUS:
				{
				setState(225);
				match(MINUS);
				setState(226);
				p6();
				}
				break;
			case NOT:
				{
				setState(227);
				match(NOT);
				setState(228);
				p6();
				}
				break;
			case FALSE:
			case L_PAR:
			case STRING_:
			case ID:
			case NUM:
				{
				setState(229);
				p6();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(271);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new P0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_p0);
						setState(232);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(233);
						match(OR);
						setState(234);
						p6();
						}
						break;
					case 2:
						{
						_localctx = new P0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_p0);
						setState(235);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(236);
						match(AND);
						setState(237);
						p6();
						}
						break;
					case 3:
						{
						_localctx = new P0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_p0);
						setState(238);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(239);
						match(EQ);
						setState(240);
						p6();
						}
						break;
					case 4:
						{
						_localctx = new P0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_p0);
						setState(241);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(242);
						match(NON_EQ);
						setState(243);
						p6();
						}
						break;
					case 5:
						{
						_localctx = new P0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_p0);
						setState(244);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(245);
						match(LOWER_EQ);
						setState(246);
						p6();
						}
						break;
					case 6:
						{
						_localctx = new P0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_p0);
						setState(247);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(248);
						match(GREATER_EQ);
						setState(249);
						p6();
						}
						break;
					case 7:
						{
						_localctx = new P0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_p0);
						setState(250);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(251);
						match(LOWER);
						setState(252);
						p6();
						}
						break;
					case 8:
						{
						_localctx = new P0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_p0);
						setState(253);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(254);
						match(GREATER);
						setState(255);
						p6();
						}
						break;
					case 9:
						{
						_localctx = new P0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_p0);
						setState(256);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(257);
						match(PLUS);
						setState(258);
						p6();
						}
						break;
					case 10:
						{
						_localctx = new P0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_p0);
						setState(259);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(260);
						match(MINUS);
						setState(261);
						p6();
						}
						break;
					case 11:
						{
						_localctx = new P0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_p0);
						setState(262);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(263);
						match(MUL);
						setState(264);
						p6();
						}
						break;
					case 12:
						{
						_localctx = new P0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_p0);
						setState(265);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(266);
						match(DIV);
						setState(267);
						p6();
						}
						break;
					case 13:
						{
						_localctx = new P0Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_p0);
						setState(268);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(269);
						match(MOD);
						setState(270);
						p6();
						}
						break;
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class P6Context extends ParserRuleContext {
		public TerminalNode L_PAR() { return getToken(MyLangParser.L_PAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode R_PAR() { return getToken(MyLangParser.R_PAR, 0); }
		public TerminalNode ID() { return getToken(MyLangParser.ID, 0); }
		public TerminalNode NUM() { return getToken(MyLangParser.NUM, 0); }
		public TerminalNode FALSE() { return getToken(MyLangParser.FALSE, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public TerminalNode STRING_() { return getToken(MyLangParser.STRING_, 0); }
		public P6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p6; }
	}

	public final P6Context p6() throws RecognitionException {
		P6Context _localctx = new P6Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_p6);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(L_PAR);
				setState(277);
				exp(0);
				setState(278);
				match(R_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				match(NUM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(283);
				function_call();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(284);
				match(ID);
				setState(285);
				array_type();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(286);
				match(STRING_);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 24:
			return p0_sempred((P0Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean p0_sempred(P0Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 6);
		case 13:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0124\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4H\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\be\n\b\3\t\3\t\3\t\3\t\3\t\5\tl\n\t\3\n\3\n\3\n\3\n\5\nr\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0085\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0090\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\5\16\u0097\n\16\3\17\3\17\5\17\u009b\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\5\23\u00bd\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00c5\n\24\3\25\3\25\3\26\3\26\5\26\u00cb\n\26\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\5\30\u00d4\n\30\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u00dc"+
		"\n\31\f\31\16\31\u00df\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5"+
		"\32\u00e9\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\7\32\u0112\n\32\f\32\16\32\u0115\13\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0122\n\33\3\33\2\4\60\62\34\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\3\4\2\n\f\16\20\2\u0134"+
		"\2\66\3\2\2\2\4=\3\2\2\2\6G\3\2\2\2\bI\3\2\2\2\nM\3\2\2\2\fS\3\2\2\2\16"+
		"d\3\2\2\2\20k\3\2\2\2\22q\3\2\2\2\24\u0084\3\2\2\2\26\u0086\3\2\2\2\30"+
		"\u008f\3\2\2\2\32\u0096\3\2\2\2\34\u009a\3\2\2\2\36\u009c\3\2\2\2 \u00a8"+
		"\3\2\2\2\"\u00b0\3\2\2\2$\u00bc\3\2\2\2&\u00c4\3\2\2\2(\u00c6\3\2\2\2"+
		"*\u00ca\3\2\2\2,\u00cc\3\2\2\2.\u00d3\3\2\2\2\60\u00d5\3\2\2\2\62\u00e8"+
		"\3\2\2\2\64\u0121\3\2\2\2\66\67\5\4\3\2\678\7\2\2\38\3\3\2\2\29:\5\6\4"+
		"\2:;\5\4\3\2;>\3\2\2\2<>\3\2\2\2=9\3\2\2\2=<\3\2\2\2>\5\3\2\2\2?@\5\b"+
		"\5\2@A\7)\2\2AH\3\2\2\2BC\5\n\6\2CD\7)\2\2DH\3\2\2\2EH\5\f\7\2FH\5\26"+
		"\f\2G?\3\2\2\2GB\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\7\3\2\2\2IJ\7,\2\2JK\7*"+
		"\2\2KL\5$\23\2L\t\3\2\2\2MN\7,\2\2NO\7*\2\2OP\5$\23\2PQ\7 \2\2QR\5\60"+
		"\31\2R\13\3\2\2\2ST\7\25\2\2TU\7,\2\2UV\7\"\2\2VW\5\16\b\2WX\7!\2\2XY"+
		"\7*\2\2YZ\5*\26\2Z[\7#\2\2[\\\5\22\n\2\\]\7$\2\2]\r\3\2\2\2^_\7,\2\2_"+
		"`\7*\2\2`a\5$\23\2ab\5\20\t\2be\3\2\2\2ce\3\2\2\2d^\3\2\2\2dc\3\2\2\2"+
		"e\17\3\2\2\2fg\7.\2\2gh\7,\2\2hi\7*\2\2il\5$\23\2jl\3\2\2\2kf\3\2\2\2"+
		"kj\3\2\2\2l\21\3\2\2\2mn\5\24\13\2no\5\22\n\2or\3\2\2\2pr\3\2\2\2qm\3"+
		"\2\2\2qp\3\2\2\2r\23\3\2\2\2st\5\b\5\2tu\7)\2\2u\u0085\3\2\2\2vw\5\n\6"+
		"\2wx\7)\2\2x\u0085\3\2\2\2y\u0085\5\"\22\2z\u0085\5\34\17\2{|\5\60\31"+
		"\2|}\7)\2\2}\u0085\3\2\2\2~\177\7\22\2\2\177\u0080\5\60\31\2\u0080\u0081"+
		"\7)\2\2\u0081\u0085\3\2\2\2\u0082\u0083\7\22\2\2\u0083\u0085\7)\2\2\u0084"+
		"s\3\2\2\2\u0084v\3\2\2\2\u0084y\3\2\2\2\u0084z\3\2\2\2\u0084{\3\2\2\2"+
		"\u0084~\3\2\2\2\u0084\u0082\3\2\2\2\u0085\25\3\2\2\2\u0086\u0087\7,\2"+
		"\2\u0087\u0088\7\"\2\2\u0088\u0089\5\30\r\2\u0089\u008a\7!\2\2\u008a\27"+
		"\3\2\2\2\u008b\u008c\5\60\31\2\u008c\u008d\5\32\16\2\u008d\u0090\3\2\2"+
		"\2\u008e\u0090\3\2\2\2\u008f\u008b\3\2\2\2\u008f\u008e\3\2\2\2\u0090\31"+
		"\3\2\2\2\u0091\u0092\7.\2\2\u0092\u0093\5\60\31\2\u0093\u0094\5\32\16"+
		"\2\u0094\u0097\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0091\3\2\2\2\u0096\u0095"+
		"\3\2\2\2\u0097\33\3\2\2\2\u0098\u009b\5\36\20\2\u0099\u009b\5 \21\2\u009a"+
		"\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\35\3\2\2\2\u009c\u009d\7&\2\2"+
		"\u009d\u009e\7\"\2\2\u009e\u009f\5\n\6\2\u009f\u00a0\7)\2\2\u00a0\u00a1"+
		"\5\60\31\2\u00a1\u00a2\7)\2\2\u00a2\u00a3\5\60\31\2\u00a3\u00a4\7!\2\2"+
		"\u00a4\u00a5\7#\2\2\u00a5\u00a6\5\22\n\2\u00a6\u00a7\7#\2\2\u00a7\37\3"+
		"\2\2\2\u00a8\u00a9\7\'\2\2\u00a9\u00aa\7\"\2\2\u00aa\u00ab\5\60\31\2\u00ab"+
		"\u00ac\7!\2\2\u00ac\u00ad\7#\2\2\u00ad\u00ae\5\22\n\2\u00ae\u00af\7$\2"+
		"\2\u00af!\3\2\2\2\u00b0\u00b1\7\23\2\2\u00b1\u00b2\7\"\2\2\u00b2\u00b3"+
		"\5\60\31\2\u00b3\u00b4\7!\2\2\u00b4\u00b5\7#\2\2\u00b5\u00b6\5\22\n\2"+
		"\u00b6\u00b7\7$\2\2\u00b7#\3\2\2\2\u00b8\u00b9\5(\25\2\u00b9\u00ba\5&"+
		"\24\2\u00ba\u00bd\3\2\2\2\u00bb\u00bd\5(\25\2\u00bc\u00b8\3\2\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd%\3\2\2\2\u00be\u00bf\7(\2\2\u00bf\u00c0\5\60\31\2"+
		"\u00c0\u00c1\7%\2\2\u00c1\u00c2\5&\24\2\u00c2\u00c5\3\2\2\2\u00c3\u00c5"+
		"\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\'\3\2\2\2\u00c6"+
		"\u00c7\t\2\2\2\u00c7)\3\2\2\2\u00c8\u00cb\5(\25\2\u00c9\u00cb\7\21\2\2"+
		"\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb+\3\2\2\2\u00cc\u00cd\5"+
		".\30\2\u00cd\u00ce\7 \2\2\u00ce\u00cf\5\60\31\2\u00cf-\3\2\2\2\u00d0\u00d4"+
		"\7,\2\2\u00d1\u00d2\7,\2\2\u00d2\u00d4\5&\24\2\u00d3\u00d0\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4/\3\2\2\2\u00d5\u00d6\b\31\1\2\u00d6\u00d7\5\62\32"+
		"\2\u00d7\u00dd\3\2\2\2\u00d8\u00d9\f\4\2\2\u00d9\u00da\7 \2\2\u00da\u00dc"+
		"\5\62\32\2\u00db\u00d8\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2"+
		"\u00dd\u00de\3\2\2\2\u00de\61\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1"+
		"\b\32\1\2\u00e1\u00e2\7\26\2\2\u00e2\u00e9\5\64\33\2\u00e3\u00e4\7\27"+
		"\2\2\u00e4\u00e9\5\64\33\2\u00e5\u00e6\7\35\2\2\u00e6\u00e9\5\64\33\2"+
		"\u00e7\u00e9\5\64\33\2\u00e8\u00e0\3\2\2\2\u00e8\u00e3\3\2\2\2\u00e8\u00e5"+
		"\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\u0113\3\2\2\2\u00ea\u00eb\f\23\2\2"+
		"\u00eb\u00ec\7\33\2\2\u00ec\u0112\5\64\33\2\u00ed\u00ee\f\22\2\2\u00ee"+
		"\u00ef\7\34\2\2\u00ef\u0112\5\64\33\2\u00f0\u00f1\f\21\2\2\u00f1\u00f2"+
		"\7\4\2\2\u00f2\u0112\5\64\33\2\u00f3\u00f4\f\20\2\2\u00f4\u00f5\7\5\2"+
		"\2\u00f5\u0112\5\64\33\2\u00f6\u00f7\f\17\2\2\u00f7\u00f8\7\6\2\2\u00f8"+
		"\u0112\5\64\33\2\u00f9\u00fa\f\16\2\2\u00fa\u00fb\7\7\2\2\u00fb\u0112"+
		"\5\64\33\2\u00fc\u00fd\f\r\2\2\u00fd\u00fe\7\36\2\2\u00fe\u0112\5\64\33"+
		"\2\u00ff\u0100\f\f\2\2\u0100\u0101\7\37\2\2\u0101\u0112\5\64\33\2\u0102"+
		"\u0103\f\13\2\2\u0103\u0104\7\26\2\2\u0104\u0112\5\64\33\2\u0105\u0106"+
		"\f\n\2\2\u0106\u0107\7\27\2\2\u0107\u0112\5\64\33\2\u0108\u0109\f\t\2"+
		"\2\u0109\u010a\7\30\2\2\u010a\u0112\5\64\33\2\u010b\u010c\f\b\2\2\u010c"+
		"\u010d\7\31\2\2\u010d\u0112\5\64\33\2\u010e\u010f\f\7\2\2\u010f\u0110"+
		"\7\32\2\2\u0110\u0112\5\64\33\2\u0111\u00ea\3\2\2\2\u0111\u00ed\3\2\2"+
		"\2\u0111\u00f0\3\2\2\2\u0111\u00f3\3\2\2\2\u0111\u00f6\3\2\2\2\u0111\u00f9"+
		"\3\2\2\2\u0111\u00fc\3\2\2\2\u0111\u00ff\3\2\2\2\u0111\u0102\3\2\2\2\u0111"+
		"\u0105\3\2\2\2\u0111\u0108\3\2\2\2\u0111\u010b\3\2\2\2\u0111\u010e\3\2"+
		"\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\63\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0117\7\"\2\2\u0117\u0118\5\60\31"+
		"\2\u0118\u0119\7!\2\2\u0119\u0122\3\2\2\2\u011a\u0122\7,\2\2\u011b\u0122"+
		"\7-\2\2\u011c\u0122\7\t\2\2\u011d\u0122\5\26\f\2\u011e\u011f\7,\2\2\u011f"+
		"\u0122\5&\24\2\u0120\u0122\7+\2\2\u0121\u0116\3\2\2\2\u0121\u011a\3\2"+
		"\2\2\u0121\u011b\3\2\2\2\u0121\u011c\3\2\2\2\u0121\u011d\3\2\2\2\u0121"+
		"\u011e\3\2\2\2\u0121\u0120\3\2\2\2\u0122\65\3\2\2\2\24=Gdkq\u0084\u008f"+
		"\u0096\u009a\u00bc\u00c4\u00ca\u00d3\u00dd\u00e8\u0111\u0113\u0121";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}