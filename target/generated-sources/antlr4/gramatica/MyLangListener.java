// Generated from gramatica\MyLang.g4 by ANTLR 4.9.2
package gramatica;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLangParser}.
 */
public interface MyLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(MyLangParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#variableDecl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(MyLangParser.VariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MyLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MyLangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MyLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MyLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(MyLangParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(MyLangParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MyLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MyLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(MyLangParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpr}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(MyLangParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(MyLangParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpr}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(MyLangParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(MyLangParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpr}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(MyLangParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(MyLangParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(MyLangParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(MyLangParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralExpr}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(MyLangParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(MyLangParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpr}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(MyLangParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(MyLangParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link MyLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(MyLangParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MyLangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MyLangParser.LiteralContext ctx);
}