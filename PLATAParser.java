// Generated from PLATA.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PLATAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, AVANZA=7, GIRA=8, PARA=9, 
		WHILE=10, ELSE_IF=11, ELSE=12, IF=13, TRUE=14, FALSE=15, NULL=16, MENOS=17, 
		MULTIPLICACION=18, DIVISION=19, MODULO=20, SUMA=21, MAYOR_IGUAL=22, MENOR_IGUAL=23, 
		MAYOR=24, MENOR=25, DISTINTO=26, IGUAL_QUE=27, NOT=28, AND=29, OR=30, 
		INT=31, FLOAT=32, STRING=33, ID=34, LINE_COMMENT=35, COMMENT=36, WS=37;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_avanza = 2, RULE_gira = 3, 
		RULE_para = 4, RULE_asignacion = 5, RULE_if_sentencia = 6, RULE_bucle_while = 7, 
		RULE_bloque = 8, RULE_expr = 9, RULE_expr_aritmeticas = 10, RULE_expr_relacionales = 11, 
		RULE_expr_logica = 12, RULE_atomico = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencia", "avanza", "gira", "para", "asignacion", "if_sentencia", 
			"bucle_while", "bloque", "expr", "expr_aritmeticas", "expr_relacionales", 
			"expr_logica", "atomico"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'='", "'{'", "'}'", null, null, null, null, 
			"'sinosi'", "'sino'", "'si'", null, null, null, "'-'", "'*'", "'/'", 
			"'%'", "'+'", "'>='", "'<='", "'>'", "'<'", "'!='", "'=='", "'!'", "'&&'", 
			"'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "AVANZA", "GIRA", "PARA", "WHILE", 
			"ELSE_IF", "ELSE", "IF", "TRUE", "FALSE", "NULL", "MENOS", "MULTIPLICACION", 
			"DIVISION", "MODULO", "SUMA", "MAYOR_IGUAL", "MENOR_IGUAL", "MAYOR", 
			"MENOR", "DISTINTO", "IGUAL_QUE", "NOT", "AND", "OR", "INT", "FLOAT", 
			"STRING", "ID", "LINE_COMMENT", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "PLATA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PLATAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PLATAParser.EOF, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				sentencia();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 32212445058L) != 0) );
			setState(33);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public AvanzaContext avanza() {
			return getRuleContext(AvanzaContext.class,0);
		}
		public GiraContext gira() {
			return getRuleContext(GiraContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public If_sentenciaContext if_sentencia() {
			return getRuleContext(If_sentenciaContext.class,0);
		}
		public Bucle_whileContext bucle_while() {
			return getRuleContext(Bucle_whileContext.class,0);
		}
		public Expr_aritmeticasContext expr_aritmeticas() {
			return getRuleContext(Expr_aritmeticasContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				avanza();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				gira();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				para();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				asignacion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				if_sentencia();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				bucle_while();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(41);
				expr_aritmeticas(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AvanzaContext extends ParserRuleContext {
		public TerminalNode AVANZA() { return getToken(PLATAParser.AVANZA, 0); }
		public List<Expr_aritmeticasContext> expr_aritmeticas() {
			return getRuleContexts(Expr_aritmeticasContext.class);
		}
		public Expr_aritmeticasContext expr_aritmeticas(int i) {
			return getRuleContext(Expr_aritmeticasContext.class,i);
		}
		public AvanzaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avanza; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitAvanza(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvanzaContext avanza() throws RecognitionException {
		AvanzaContext _localctx = new AvanzaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_avanza);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(AVANZA);
			setState(45);
			match(T__0);
			setState(46);
			expr_aritmeticas(0);
			setState(47);
			match(T__1);
			setState(48);
			expr_aritmeticas(0);
			setState(49);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GiraContext extends ParserRuleContext {
		public TerminalNode GIRA() { return getToken(PLATAParser.GIRA, 0); }
		public Expr_aritmeticasContext expr_aritmeticas() {
			return getRuleContext(Expr_aritmeticasContext.class,0);
		}
		public GiraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gira; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitGira(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GiraContext gira() throws RecognitionException {
		GiraContext _localctx = new GiraContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_gira);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(GIRA);
			setState(52);
			match(T__0);
			setState(53);
			expr_aritmeticas(0);
			setState(54);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(PLATAParser.PARA, 0); }
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_para);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(PARA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLATAParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ID);
			setState(59);
			match(T__3);
			setState(60);
			expr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class If_sentenciaContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PLATAParser.IF, 0); }
		public List<Expr_logicaContext> expr_logica() {
			return getRuleContexts(Expr_logicaContext.class);
		}
		public Expr_logicaContext expr_logica(int i) {
			return getRuleContext(Expr_logicaContext.class,i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public List<TerminalNode> ELSE_IF() { return getTokens(PLATAParser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(PLATAParser.ELSE_IF, i);
		}
		public TerminalNode ELSE() { return getToken(PLATAParser.ELSE, 0); }
		public If_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_sentencia; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitIf_sentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_sentenciaContext if_sentencia() throws RecognitionException {
		If_sentenciaContext _localctx = new If_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_sentencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(IF);
			setState(63);
			match(T__0);
			setState(64);
			expr_logica(0);
			setState(65);
			match(T__2);
			setState(66);
			bloque();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(67);
				match(ELSE_IF);
				setState(68);
				match(T__0);
				setState(69);
				expr_logica(0);
				setState(70);
				match(T__2);
				setState(71);
				bloque();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(78);
				match(ELSE);
				setState(79);
				bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bucle_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PLATAParser.WHILE, 0); }
		public Expr_logicaContext expr_logica() {
			return getRuleContext(Expr_logicaContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Bucle_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_while; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitBucle_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bucle_whileContext bucle_while() throws RecognitionException {
		Bucle_whileContext _localctx = new Bucle_whileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bucle_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(WHILE);
			setState(83);
			match(T__0);
			setState(84);
			expr_logica(0);
			setState(85);
			match(T__2);
			setState(86);
			bloque();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__4);
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				sentencia();
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 32212445058L) != 0) );
			setState(94);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Expr_aritmeticasContext expr_aritmeticas() {
			return getRuleContext(Expr_aritmeticasContext.class,0);
		}
		public Expr_relacionalesContext expr_relacionales() {
			return getRuleContext(Expr_relacionalesContext.class,0);
		}
		public Expr_logicaContext expr_logica() {
			return getRuleContext(Expr_logicaContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expr);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				expr_aritmeticas(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				expr_relacionales();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				expr_logica(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_aritmeticasContext extends ParserRuleContext {
		public Expr_aritmeticasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_aritmeticas; }
	 
		public Expr_aritmeticasContext() { }
		public void copyFrom(Expr_aritmeticasContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicacionExprAritmeticaContext extends Expr_aritmeticasContext {
		public Token op;
		public List<Expr_aritmeticasContext> expr_aritmeticas() {
			return getRuleContexts(Expr_aritmeticasContext.class);
		}
		public Expr_aritmeticasContext expr_aritmeticas(int i) {
			return getRuleContext(Expr_aritmeticasContext.class,i);
		}
		public TerminalNode MULTIPLICACION() { return getToken(PLATAParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(PLATAParser.DIVISION, 0); }
		public TerminalNode MODULO() { return getToken(PLATAParser.MODULO, 0); }
		public MultiplicacionExprAritmeticaContext(Expr_aritmeticasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitMultiplicacionExprAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumaExprAritmeticaContext extends Expr_aritmeticasContext {
		public Token op;
		public List<Expr_aritmeticasContext> expr_aritmeticas() {
			return getRuleContexts(Expr_aritmeticasContext.class);
		}
		public Expr_aritmeticasContext expr_aritmeticas(int i) {
			return getRuleContext(Expr_aritmeticasContext.class,i);
		}
		public TerminalNode SUMA() { return getToken(PLATAParser.SUMA, 0); }
		public TerminalNode MENOS() { return getToken(PLATAParser.MENOS, 0); }
		public SumaExprAritmeticaContext(Expr_aritmeticasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitSumaExprAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MenosExprAritmeticaContext extends Expr_aritmeticasContext {
		public TerminalNode MENOS() { return getToken(PLATAParser.MENOS, 0); }
		public Expr_aritmeticasContext expr_aritmeticas() {
			return getRuleContext(Expr_aritmeticasContext.class,0);
		}
		public MenosExprAritmeticaContext(Expr_aritmeticasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitMenosExprAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomicoExprAritmeticaContext extends Expr_aritmeticasContext {
		public AtomicoContext atomico() {
			return getRuleContext(AtomicoContext.class,0);
		}
		public AtomicoExprAritmeticaContext(Expr_aritmeticasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitAtomicoExprAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisExprAritmeticaContext extends Expr_aritmeticasContext {
		public Expr_aritmeticasContext expr_aritmeticas() {
			return getRuleContext(Expr_aritmeticasContext.class,0);
		}
		public ParentesisExprAritmeticaContext(Expr_aritmeticasContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitParentesisExprAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_aritmeticasContext expr_aritmeticas() throws RecognitionException {
		return expr_aritmeticas(0);
	}

	private Expr_aritmeticasContext expr_aritmeticas(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_aritmeticasContext _localctx = new Expr_aritmeticasContext(_ctx, _parentState);
		Expr_aritmeticasContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr_aritmeticas, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOS:
				{
				_localctx = new MenosExprAritmeticaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(102);
				match(MENOS);
				setState(103);
				expr_aritmeticas(5);
				}
				break;
			case TRUE:
			case FALSE:
			case INT:
			case FLOAT:
			case STRING:
			case ID:
				{
				_localctx = new AtomicoExprAritmeticaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				atomico();
				}
				break;
			case T__0:
				{
				_localctx = new ParentesisExprAritmeticaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(T__0);
				setState(106);
				expr_aritmeticas(0);
				setState(107);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(117);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicacionExprAritmeticaContext(new Expr_aritmeticasContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_aritmeticas);
						setState(111);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(112);
						((MultiplicacionExprAritmeticaContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
							((MultiplicacionExprAritmeticaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
						expr_aritmeticas(5);
						}
						break;
					case 2:
						{
						_localctx = new SumaExprAritmeticaContext(new Expr_aritmeticasContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_aritmeticas);
						setState(114);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(115);
						((SumaExprAritmeticaContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MENOS || _la==SUMA) ) {
							((SumaExprAritmeticaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(116);
						expr_aritmeticas(4);
						}
						break;
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_relacionalesContext extends ParserRuleContext {
		public Expr_relacionalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_relacionales; }
	 
		public Expr_relacionalesContext() { }
		public void copyFrom(Expr_relacionalesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelacionesExprRelacionalesContext extends Expr_relacionalesContext {
		public Token op;
		public List<Expr_aritmeticasContext> expr_aritmeticas() {
			return getRuleContexts(Expr_aritmeticasContext.class);
		}
		public Expr_aritmeticasContext expr_aritmeticas(int i) {
			return getRuleContext(Expr_aritmeticasContext.class,i);
		}
		public TerminalNode MAYOR_IGUAL() { return getToken(PLATAParser.MAYOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(PLATAParser.MENOR_IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(PLATAParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(PLATAParser.MAYOR, 0); }
		public RelacionesExprRelacionalesContext(Expr_relacionalesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitRelacionesExprRelacionales(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisExprRelacionalesContext extends Expr_relacionalesContext {
		public Expr_relacionalesContext expr_relacionales() {
			return getRuleContext(Expr_relacionalesContext.class,0);
		}
		public ParentesisExprRelacionalesContext(Expr_relacionalesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitParentesisExprRelacionales(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IgualdadesExprRelacionalesContext extends Expr_relacionalesContext {
		public Token op;
		public List<Expr_aritmeticasContext> expr_aritmeticas() {
			return getRuleContexts(Expr_aritmeticasContext.class);
		}
		public Expr_aritmeticasContext expr_aritmeticas(int i) {
			return getRuleContext(Expr_aritmeticasContext.class,i);
		}
		public TerminalNode IGUAL_QUE() { return getToken(PLATAParser.IGUAL_QUE, 0); }
		public TerminalNode DISTINTO() { return getToken(PLATAParser.DISTINTO, 0); }
		public IgualdadesExprRelacionalesContext(Expr_relacionalesContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitIgualdadesExprRelacionales(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_relacionalesContext expr_relacionales() throws RecognitionException {
		Expr_relacionalesContext _localctx = new Expr_relacionalesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_relacionales);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new RelacionesExprRelacionalesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				expr_aritmeticas(0);
				setState(123);
				((RelacionesExprRelacionalesContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) ) {
					((RelacionesExprRelacionalesContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(124);
				expr_aritmeticas(0);
				}
				break;
			case 2:
				_localctx = new IgualdadesExprRelacionalesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				expr_aritmeticas(0);
				setState(127);
				((IgualdadesExprRelacionalesContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DISTINTO || _la==IGUAL_QUE) ) {
					((IgualdadesExprRelacionalesContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(128);
				expr_aritmeticas(0);
				}
				break;
			case 3:
				_localctx = new ParentesisExprRelacionalesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(T__0);
				setState(131);
				expr_relacionales();
				setState(132);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expr_logicaContext extends ParserRuleContext {
		public Expr_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_logica; }
	 
		public Expr_logicaContext() { }
		public void copyFrom(Expr_logicaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicaExprRelacionalesContext extends Expr_logicaContext {
		public Expr_relacionalesContext expr_relacionales() {
			return getRuleContext(Expr_relacionalesContext.class,0);
		}
		public LogicaExprRelacionalesContext(Expr_logicaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitLogicaExprRelacionales(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ORExprLogicaContext extends Expr_logicaContext {
		public List<Expr_logicaContext> expr_logica() {
			return getRuleContexts(Expr_logicaContext.class);
		}
		public Expr_logicaContext expr_logica(int i) {
			return getRuleContext(Expr_logicaContext.class,i);
		}
		public TerminalNode OR() { return getToken(PLATAParser.OR, 0); }
		public ORExprLogicaContext(Expr_logicaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitORExprLogica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolExprLogicaContext extends Expr_logicaContext {
		public TerminalNode TRUE() { return getToken(PLATAParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PLATAParser.FALSE, 0); }
		public BoolExprLogicaContext(Expr_logicaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitBoolExprLogica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprLogicaContext extends Expr_logicaContext {
		public TerminalNode ID() { return getToken(PLATAParser.ID, 0); }
		public IdExprLogicaContext(Expr_logicaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitIdExprLogica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisExprLogicaContext extends Expr_logicaContext {
		public Expr_logicaContext expr_logica() {
			return getRuleContext(Expr_logicaContext.class,0);
		}
		public ParentesisExprLogicaContext(Expr_logicaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitParentesisExprLogica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprLogicaContext extends Expr_logicaContext {
		public List<Expr_logicaContext> expr_logica() {
			return getRuleContexts(Expr_logicaContext.class);
		}
		public Expr_logicaContext expr_logica(int i) {
			return getRuleContext(Expr_logicaContext.class,i);
		}
		public TerminalNode AND() { return getToken(PLATAParser.AND, 0); }
		public AndExprLogicaContext(Expr_logicaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitAndExprLogica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends Expr_logicaContext {
		public TerminalNode NOT() { return getToken(PLATAParser.NOT, 0); }
		public Expr_logicaContext expr_logica() {
			return getRuleContext(Expr_logicaContext.class,0);
		}
		public NotExprContext(Expr_logicaContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_logicaContext expr_logica() throws RecognitionException {
		return expr_logica(0);
	}

	private Expr_logicaContext expr_logica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_logicaContext _localctx = new Expr_logicaContext(_ctx, _parentState);
		Expr_logicaContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr_logica, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(137);
				match(NOT);
				setState(138);
				expr_logica(7);
				}
				break;
			case 2:
				{
				_localctx = new LogicaExprRelacionalesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				expr_relacionales();
				}
				break;
			case 3:
				{
				_localctx = new BoolExprLogicaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				{
				_localctx = new IdExprLogicaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new ParentesisExprLogicaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(T__0);
				setState(143);
				expr_logica(0);
				setState(144);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(154);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new AndExprLogicaContext(new Expr_logicaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_logica);
						setState(148);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(149);
						match(AND);
						setState(150);
						expr_logica(7);
						}
						break;
					case 2:
						{
						_localctx = new ORExprLogicaContext(new Expr_logicaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr_logica);
						setState(151);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(152);
						match(OR);
						setState(153);
						expr_logica(6);
						}
						break;
					}
					} 
				}
				setState(158);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomicoContext extends ParserRuleContext {
		public AtomicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomico; }
	 
		public AtomicoContext() { }
		public void copyFrom(AtomicoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumeroAtomicoContext extends AtomicoContext {
		public TerminalNode INT() { return getToken(PLATAParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PLATAParser.FLOAT, 0); }
		public NumeroAtomicoContext(AtomicoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitNumeroAtomico(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanAtomicoContext extends AtomicoContext {
		public TerminalNode TRUE() { return getToken(PLATAParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PLATAParser.FALSE, 0); }
		public BooleanAtomicoContext(AtomicoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitBooleanAtomico(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdAtomicoContext extends AtomicoContext {
		public TerminalNode ID() { return getToken(PLATAParser.ID, 0); }
		public IdAtomicoContext(AtomicoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitIdAtomico(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAtomicoContext extends AtomicoContext {
		public TerminalNode STRING() { return getToken(PLATAParser.STRING, 0); }
		public StringAtomicoContext(AtomicoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLATAVisitor ) return ((PLATAVisitor<? extends T>)visitor).visitStringAtomico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicoContext atomico() throws RecognitionException {
		AtomicoContext _localctx = new AtomicoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atomico);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				_localctx = new NumeroAtomicoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomicoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
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
				_localctx = new IdAtomicoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomicoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(STRING);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_aritmeticas_sempred((Expr_aritmeticasContext)_localctx, predIndex);
		case 12:
			return expr_logica_sempred((Expr_logicaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_aritmeticas_sempred(Expr_aritmeticasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_logica_sempred(Expr_logicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u00a6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0004\u0000\u001e\b\u0000\u000b"+
		"\u0000\f\u0000\u001f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001+\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006J\b\u0006\n\u0006\f\u0006M\t\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006Q\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0004\b[\b\b\u000b\b\f\b\\\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0003\td\b\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\nn\b\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0005\nv\b\n\n\n\f\ny\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0087\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u0093\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u009b\b\f\n\f\f\f\u009e\t\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u00a4\b\r\u0001\r\u0000\u0002\u0014\u0018\u000e"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u0000\u0006\u0001\u0000\u0012\u0014\u0002\u0000\u0011\u0011\u0015\u0015"+
		"\u0001\u0000\u0016\u0019\u0001\u0000\u001a\u001b\u0001\u0000\u000e\u000f"+
		"\u0001\u0000\u001f \u00b2\u0000\u001d\u0001\u0000\u0000\u0000\u0002*\u0001"+
		"\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000"+
		"\u0000\b8\u0001\u0000\u0000\u0000\n:\u0001\u0000\u0000\u0000\f>\u0001"+
		"\u0000\u0000\u0000\u000eR\u0001\u0000\u0000\u0000\u0010X\u0001\u0000\u0000"+
		"\u0000\u0012c\u0001\u0000\u0000\u0000\u0014m\u0001\u0000\u0000\u0000\u0016"+
		"\u0086\u0001\u0000\u0000\u0000\u0018\u0092\u0001\u0000\u0000\u0000\u001a"+
		"\u00a3\u0001\u0000\u0000\u0000\u001c\u001e\u0003\u0002\u0001\u0000\u001d"+
		"\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f"+
		"\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!\"\u0005\u0000\u0000\u0001\"\u0001\u0001\u0000\u0000"+
		"\u0000#+\u0003\u0004\u0002\u0000$+\u0003\u0006\u0003\u0000%+\u0003\b\u0004"+
		"\u0000&+\u0003\n\u0005\u0000\'+\u0003\f\u0006\u0000(+\u0003\u000e\u0007"+
		"\u0000)+\u0003\u0014\n\u0000*#\u0001\u0000\u0000\u0000*$\u0001\u0000\u0000"+
		"\u0000*%\u0001\u0000\u0000\u0000*&\u0001\u0000\u0000\u0000*\'\u0001\u0000"+
		"\u0000\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000\u0000\u0000+\u0003"+
		"\u0001\u0000\u0000\u0000,-\u0005\u0007\u0000\u0000-.\u0005\u0001\u0000"+
		"\u0000./\u0003\u0014\n\u0000/0\u0005\u0002\u0000\u000001\u0003\u0014\n"+
		"\u000012\u0005\u0003\u0000\u00002\u0005\u0001\u0000\u0000\u000034\u0005"+
		"\b\u0000\u000045\u0005\u0001\u0000\u000056\u0003\u0014\n\u000067\u0005"+
		"\u0003\u0000\u00007\u0007\u0001\u0000\u0000\u000089\u0005\t\u0000\u0000"+
		"9\t\u0001\u0000\u0000\u0000:;\u0005\"\u0000\u0000;<\u0005\u0004\u0000"+
		"\u0000<=\u0003\u0012\t\u0000=\u000b\u0001\u0000\u0000\u0000>?\u0005\r"+
		"\u0000\u0000?@\u0005\u0001\u0000\u0000@A\u0003\u0018\f\u0000AB\u0005\u0003"+
		"\u0000\u0000BK\u0003\u0010\b\u0000CD\u0005\u000b\u0000\u0000DE\u0005\u0001"+
		"\u0000\u0000EF\u0003\u0018\f\u0000FG\u0005\u0003\u0000\u0000GH\u0003\u0010"+
		"\b\u0000HJ\u0001\u0000\u0000\u0000IC\u0001\u0000\u0000\u0000JM\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LP\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NO\u0005\f\u0000\u0000OQ\u0003"+
		"\u0010\b\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\r"+
		"\u0001\u0000\u0000\u0000RS\u0005\n\u0000\u0000ST\u0005\u0001\u0000\u0000"+
		"TU\u0003\u0018\f\u0000UV\u0005\u0003\u0000\u0000VW\u0003\u0010\b\u0000"+
		"W\u000f\u0001\u0000\u0000\u0000XZ\u0005\u0005\u0000\u0000Y[\u0003\u0002"+
		"\u0001\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^_\u0005\u0006\u0000\u0000_\u0011\u0001\u0000\u0000\u0000`d\u0003\u0014"+
		"\n\u0000ad\u0003\u0016\u000b\u0000bd\u0003\u0018\f\u0000c`\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000d\u0013"+
		"\u0001\u0000\u0000\u0000ef\u0006\n\uffff\uffff\u0000fg\u0005\u0011\u0000"+
		"\u0000gn\u0003\u0014\n\u0005hn\u0003\u001a\r\u0000ij\u0005\u0001\u0000"+
		"\u0000jk\u0003\u0014\n\u0000kl\u0005\u0003\u0000\u0000ln\u0001\u0000\u0000"+
		"\u0000me\u0001\u0000\u0000\u0000mh\u0001\u0000\u0000\u0000mi\u0001\u0000"+
		"\u0000\u0000nw\u0001\u0000\u0000\u0000op\n\u0004\u0000\u0000pq\u0007\u0000"+
		"\u0000\u0000qv\u0003\u0014\n\u0005rs\n\u0003\u0000\u0000st\u0007\u0001"+
		"\u0000\u0000tv\u0003\u0014\n\u0004uo\u0001\u0000\u0000\u0000ur\u0001\u0000"+
		"\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000x\u0015\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000"+
		"\u0000z{\u0003\u0014\n\u0000{|\u0007\u0002\u0000\u0000|}\u0003\u0014\n"+
		"\u0000}\u0087\u0001\u0000\u0000\u0000~\u007f\u0003\u0014\n\u0000\u007f"+
		"\u0080\u0007\u0003\u0000\u0000\u0080\u0081\u0003\u0014\n\u0000\u0081\u0087"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0001\u0000\u0000\u0083\u0084"+
		"\u0003\u0016\u000b\u0000\u0084\u0085\u0005\u0003\u0000\u0000\u0085\u0087"+
		"\u0001\u0000\u0000\u0000\u0086z\u0001\u0000\u0000\u0000\u0086~\u0001\u0000"+
		"\u0000\u0000\u0086\u0082\u0001\u0000\u0000\u0000\u0087\u0017\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0006\f\uffff\uffff\u0000\u0089\u008a\u0005\u001c"+
		"\u0000\u0000\u008a\u0093\u0003\u0018\f\u0007\u008b\u0093\u0003\u0016\u000b"+
		"\u0000\u008c\u0093\u0007\u0004\u0000\u0000\u008d\u0093\u0005\"\u0000\u0000"+
		"\u008e\u008f\u0005\u0001\u0000\u0000\u008f\u0090\u0003\u0018\f\u0000\u0090"+
		"\u0091\u0005\u0003\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092"+
		"\u0088\u0001\u0000\u0000\u0000\u0092\u008b\u0001\u0000\u0000\u0000\u0092"+
		"\u008c\u0001\u0000\u0000\u0000\u0092\u008d\u0001\u0000\u0000\u0000\u0092"+
		"\u008e\u0001\u0000\u0000\u0000\u0093\u009c\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\n\u0006\u0000\u0000\u0095\u0096\u0005\u001d\u0000\u0000\u0096\u009b"+
		"\u0003\u0018\f\u0007\u0097\u0098\n\u0005\u0000\u0000\u0098\u0099\u0005"+
		"\u001e\u0000\u0000\u0099\u009b\u0003\u0018\f\u0006\u009a\u0094\u0001\u0000"+
		"\u0000\u0000\u009a\u0097\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000"+
		"\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000"+
		"\u0000\u0000\u009d\u0019\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000"+
		"\u0000\u0000\u009f\u00a4\u0007\u0005\u0000\u0000\u00a0\u00a4\u0007\u0004"+
		"\u0000\u0000\u00a1\u00a4\u0005\"\u0000\u0000\u00a2\u00a4\u0005!\u0000"+
		"\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a3\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u001b\u0001\u0000\u0000\u0000\u000e\u001f*KP\\cmuw\u0086"+
		"\u0092\u009a\u009c\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}