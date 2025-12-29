// Generated from c:/Users/Antonio/Desktop/UPM/TFG/antlrEjercicios/GramaticaAutomatizada/PLATA.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PLATAParser}.
 */
public interface PLATAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PLATAParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(PLATAParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLATAParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(PLATAParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLATAParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(PLATAParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLATAParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(PLATAParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLATAParser#avanza}.
	 * @param ctx the parse tree
	 */
	void enterAvanza(PLATAParser.AvanzaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLATAParser#avanza}.
	 * @param ctx the parse tree
	 */
	void exitAvanza(PLATAParser.AvanzaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLATAParser#gira}.
	 * @param ctx the parse tree
	 */
	void enterGira(PLATAParser.GiraContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLATAParser#gira}.
	 * @param ctx the parse tree
	 */
	void exitGira(PLATAParser.GiraContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLATAParser#para}.
	 * @param ctx the parse tree
	 */
	void enterPara(PLATAParser.ParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLATAParser#para}.
	 * @param ctx the parse tree
	 */
	void exitPara(PLATAParser.ParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLATAParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(PLATAParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLATAParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(PLATAParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLATAParser#if_sentencia}.
	 * @param ctx the parse tree
	 */
	void enterIf_sentencia(PLATAParser.If_sentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLATAParser#if_sentencia}.
	 * @param ctx the parse tree
	 */
	void exitIf_sentencia(PLATAParser.If_sentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLATAParser#bucle_while}.
	 * @param ctx the parse tree
	 */
	void enterBucle_while(PLATAParser.Bucle_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLATAParser#bucle_while}.
	 * @param ctx the parse tree
	 */
	void exitBucle_while(PLATAParser.Bucle_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLATAParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(PLATAParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLATAParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(PLATAParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLATAParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PLATAParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLATAParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PLATAParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicacionExprAritmetica}
	 * labeled alternative in {@link PLATAParser#expr_aritmeticas}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacionExprAritmetica(PLATAParser.MultiplicacionExprAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicacionExprAritmetica}
	 * labeled alternative in {@link PLATAParser#expr_aritmeticas}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacionExprAritmetica(PLATAParser.MultiplicacionExprAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumaExprAritmetica}
	 * labeled alternative in {@link PLATAParser#expr_aritmeticas}.
	 * @param ctx the parse tree
	 */
	void enterSumaExprAritmetica(PLATAParser.SumaExprAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumaExprAritmetica}
	 * labeled alternative in {@link PLATAParser#expr_aritmeticas}.
	 * @param ctx the parse tree
	 */
	void exitSumaExprAritmetica(PLATAParser.SumaExprAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MenosExprAritmetica}
	 * labeled alternative in {@link PLATAParser#expr_aritmeticas}.
	 * @param ctx the parse tree
	 */
	void enterMenosExprAritmetica(PLATAParser.MenosExprAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MenosExprAritmetica}
	 * labeled alternative in {@link PLATAParser#expr_aritmeticas}.
	 * @param ctx the parse tree
	 */
	void exitMenosExprAritmetica(PLATAParser.MenosExprAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomicoExprAritmetica}
	 * labeled alternative in {@link PLATAParser#expr_aritmeticas}.
	 * @param ctx the parse tree
	 */
	void enterAtomicoExprAritmetica(PLATAParser.AtomicoExprAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomicoExprAritmetica}
	 * labeled alternative in {@link PLATAParser#expr_aritmeticas}.
	 * @param ctx the parse tree
	 */
	void exitAtomicoExprAritmetica(PLATAParser.AtomicoExprAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentesisExprAritmetica}
	 * labeled alternative in {@link PLATAParser#expr_aritmeticas}.
	 * @param ctx the parse tree
	 */
	void enterParentesisExprAritmetica(PLATAParser.ParentesisExprAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentesisExprAritmetica}
	 * labeled alternative in {@link PLATAParser#expr_aritmeticas}.
	 * @param ctx the parse tree
	 */
	void exitParentesisExprAritmetica(PLATAParser.ParentesisExprAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelacionesExprRelacionales}
	 * labeled alternative in {@link PLATAParser#expr_relacionales}.
	 * @param ctx the parse tree
	 */
	void enterRelacionesExprRelacionales(PLATAParser.RelacionesExprRelacionalesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelacionesExprRelacionales}
	 * labeled alternative in {@link PLATAParser#expr_relacionales}.
	 * @param ctx the parse tree
	 */
	void exitRelacionesExprRelacionales(PLATAParser.RelacionesExprRelacionalesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IgualdadesExprRelacionales}
	 * labeled alternative in {@link PLATAParser#expr_relacionales}.
	 * @param ctx the parse tree
	 */
	void enterIgualdadesExprRelacionales(PLATAParser.IgualdadesExprRelacionalesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IgualdadesExprRelacionales}
	 * labeled alternative in {@link PLATAParser#expr_relacionales}.
	 * @param ctx the parse tree
	 */
	void exitIgualdadesExprRelacionales(PLATAParser.IgualdadesExprRelacionalesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentesisExprRelacionales}
	 * labeled alternative in {@link PLATAParser#expr_relacionales}.
	 * @param ctx the parse tree
	 */
	void enterParentesisExprRelacionales(PLATAParser.ParentesisExprRelacionalesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentesisExprRelacionales}
	 * labeled alternative in {@link PLATAParser#expr_relacionales}.
	 * @param ctx the parse tree
	 */
	void exitParentesisExprRelacionales(PLATAParser.ParentesisExprRelacionalesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicaExprRelacionales}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 */
	void enterLogicaExprRelacionales(PLATAParser.LogicaExprRelacionalesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicaExprRelacionales}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 */
	void exitLogicaExprRelacionales(PLATAParser.LogicaExprRelacionalesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ORExprLogica}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 */
	void enterORExprLogica(PLATAParser.ORExprLogicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ORExprLogica}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 */
	void exitORExprLogica(PLATAParser.ORExprLogicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExprLogica}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 */
	void enterBoolExprLogica(PLATAParser.BoolExprLogicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExprLogica}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 */
	void exitBoolExprLogica(PLATAParser.BoolExprLogicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdExprLogica}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 */
	void enterIdExprLogica(PLATAParser.IdExprLogicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdExprLogica}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 */
	void exitIdExprLogica(PLATAParser.IdExprLogicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentesisExprLogica}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 */
	void enterParentesisExprLogica(PLATAParser.ParentesisExprLogicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentesisExprLogica}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 */
	void exitParentesisExprLogica(PLATAParser.ParentesisExprLogicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExprLogica}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 */
	void enterAndExprLogica(PLATAParser.AndExprLogicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExprLogica}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 */
	void exitAndExprLogica(PLATAParser.AndExprLogicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(PLATAParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(PLATAParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numeroAtomico}
	 * labeled alternative in {@link PLATAParser#atomico}.
	 * @param ctx the parse tree
	 */
	void enterNumeroAtomico(PLATAParser.NumeroAtomicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numeroAtomico}
	 * labeled alternative in {@link PLATAParser#atomico}.
	 * @param ctx the parse tree
	 */
	void exitNumeroAtomico(PLATAParser.NumeroAtomicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtomico}
	 * labeled alternative in {@link PLATAParser#atomico}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtomico(PLATAParser.BooleanAtomicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtomico}
	 * labeled alternative in {@link PLATAParser#atomico}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtomico(PLATAParser.BooleanAtomicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtomico}
	 * labeled alternative in {@link PLATAParser#atomico}.
	 * @param ctx the parse tree
	 */
	void enterIdAtomico(PLATAParser.IdAtomicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtomico}
	 * labeled alternative in {@link PLATAParser#atomico}.
	 * @param ctx the parse tree
	 */
	void exitIdAtomico(PLATAParser.IdAtomicoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtomico}
	 * labeled alternative in {@link PLATAParser#atomico}.
	 * @param ctx the parse tree
	 */
	void enterStringAtomico(PLATAParser.StringAtomicoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtomico}
	 * labeled alternative in {@link PLATAParser#atomico}.
	 * @param ctx the parse tree
	 */
	void exitStringAtomico(PLATAParser.StringAtomicoContext ctx);
}