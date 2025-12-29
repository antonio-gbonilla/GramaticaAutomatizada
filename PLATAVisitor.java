// Generated from PLATA.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PLATAParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PLATAVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PLATAParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(PLATAParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(PLATAParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#avanza}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvanza(PLATAParser.AvanzaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#gira}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGira(PLATAParser.GiraContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara(PLATAParser.ParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(PLATAParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#if_sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_sentencia(PLATAParser.If_sentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#bucle_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucle_while(PLATAParser.Bucle_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(PLATAParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLATAParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PLATAParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicacionExprAritmetica}
	 * labeled alternative in {@link PLATAParser#expr_aritmeticas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacionExprAritmetica(PLATAParser.MultiplicacionExprAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumaExprAritmetica}
	 * labeled alternative in {@link PLATAParser#expr_aritmeticas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumaExprAritmetica(PLATAParser.SumaExprAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MenosExprAritmetica}
	 * labeled alternative in {@link PLATAParser#expr_aritmeticas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenosExprAritmetica(PLATAParser.MenosExprAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomicoExprAritmetica}
	 * labeled alternative in {@link PLATAParser#expr_aritmeticas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicoExprAritmetica(PLATAParser.AtomicoExprAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParentesisExprAritmetica}
	 * labeled alternative in {@link PLATAParser#expr_aritmeticas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesisExprAritmetica(PLATAParser.ParentesisExprAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelacionesExprRelacionales}
	 * labeled alternative in {@link PLATAParser#expr_relacionales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacionesExprRelacionales(PLATAParser.RelacionesExprRelacionalesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IgualdadesExprRelacionales}
	 * labeled alternative in {@link PLATAParser#expr_relacionales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualdadesExprRelacionales(PLATAParser.IgualdadesExprRelacionalesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParentesisExprRelacionales}
	 * labeled alternative in {@link PLATAParser#expr_relacionales}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesisExprRelacionales(PLATAParser.ParentesisExprRelacionalesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicaExprRelacionales}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicaExprRelacionales(PLATAParser.LogicaExprRelacionalesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ORExprLogica}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitORExprLogica(PLATAParser.ORExprLogicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolExprLogica}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExprLogica(PLATAParser.BoolExprLogicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdExprLogica}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExprLogica(PLATAParser.IdExprLogicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParentesisExprLogica}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesisExprLogica(PLATAParser.ParentesisExprLogicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExprLogica}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExprLogica(PLATAParser.AndExprLogicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PLATAParser#expr_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(PLATAParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numeroAtomico}
	 * labeled alternative in {@link PLATAParser#atomico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroAtomico(PLATAParser.NumeroAtomicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAtomico}
	 * labeled alternative in {@link PLATAParser#atomico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAtomico(PLATAParser.BooleanAtomicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtomico}
	 * labeled alternative in {@link PLATAParser#atomico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtomico(PLATAParser.IdAtomicoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtomico}
	 * labeled alternative in {@link PLATAParser#atomico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtomico(PLATAParser.StringAtomicoContext ctx);
}