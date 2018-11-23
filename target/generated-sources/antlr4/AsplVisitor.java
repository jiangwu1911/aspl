// Generated from Aspl.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AsplParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AsplVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AsplParser#sections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSections(AsplParser.SectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#sourceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceStatement(AsplParser.SourceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#searchStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchStatements(AsplParser.SearchStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#searchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchStatement(AsplParser.SearchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#sortStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortStatement(AsplParser.SortStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#sortField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortField(AsplParser.SortFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#limitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitStatement(AsplParser.LimitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#statsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatsStatement(AsplParser.StatsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#evalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvalStatement(AsplParser.EvalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#bucketStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucketStatement(AsplParser.BucketStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#statsGroupingColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatsGroupingColumns(AsplParser.StatsGroupingColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#statsParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatsParameters(AsplParser.StatsParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#statsFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatsFunctions(AsplParser.StatsFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#statsFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatsFunction(AsplParser.StatsFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(AsplParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#primaryBooleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryBooleanExpression(AsplParser.PrimaryBooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AsplParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(AsplParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(AsplParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(AsplParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AsplParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(AsplParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(AsplParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsplParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(AsplParser.PrimaryContext ctx);
}