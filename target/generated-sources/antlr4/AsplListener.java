// Generated from Aspl.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AsplParser}.
 */
public interface AsplListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AsplParser#sections}.
	 * @param ctx the parse tree
	 */
	void enterSections(AsplParser.SectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#sections}.
	 * @param ctx the parse tree
	 */
	void exitSections(AsplParser.SectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#sourceStatement}.
	 * @param ctx the parse tree
	 */
	void enterSourceStatement(AsplParser.SourceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#sourceStatement}.
	 * @param ctx the parse tree
	 */
	void exitSourceStatement(AsplParser.SourceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#searchStatements}.
	 * @param ctx the parse tree
	 */
	void enterSearchStatements(AsplParser.SearchStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#searchStatements}.
	 * @param ctx the parse tree
	 */
	void exitSearchStatements(AsplParser.SearchStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#searchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSearchStatement(AsplParser.SearchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#searchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSearchStatement(AsplParser.SearchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#sortStatement}.
	 * @param ctx the parse tree
	 */
	void enterSortStatement(AsplParser.SortStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#sortStatement}.
	 * @param ctx the parse tree
	 */
	void exitSortStatement(AsplParser.SortStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#sortField}.
	 * @param ctx the parse tree
	 */
	void enterSortField(AsplParser.SortFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#sortField}.
	 * @param ctx the parse tree
	 */
	void exitSortField(AsplParser.SortFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#limitStatement}.
	 * @param ctx the parse tree
	 */
	void enterLimitStatement(AsplParser.LimitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#limitStatement}.
	 * @param ctx the parse tree
	 */
	void exitLimitStatement(AsplParser.LimitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#statsStatement}.
	 * @param ctx the parse tree
	 */
	void enterStatsStatement(AsplParser.StatsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#statsStatement}.
	 * @param ctx the parse tree
	 */
	void exitStatsStatement(AsplParser.StatsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#evalStatement}.
	 * @param ctx the parse tree
	 */
	void enterEvalStatement(AsplParser.EvalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#evalStatement}.
	 * @param ctx the parse tree
	 */
	void exitEvalStatement(AsplParser.EvalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#bucketStatement}.
	 * @param ctx the parse tree
	 */
	void enterBucketStatement(AsplParser.BucketStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#bucketStatement}.
	 * @param ctx the parse tree
	 */
	void exitBucketStatement(AsplParser.BucketStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#statsGroupingColumns}.
	 * @param ctx the parse tree
	 */
	void enterStatsGroupingColumns(AsplParser.StatsGroupingColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#statsGroupingColumns}.
	 * @param ctx the parse tree
	 */
	void exitStatsGroupingColumns(AsplParser.StatsGroupingColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#statsParameters}.
	 * @param ctx the parse tree
	 */
	void enterStatsParameters(AsplParser.StatsParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#statsParameters}.
	 * @param ctx the parse tree
	 */
	void exitStatsParameters(AsplParser.StatsParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#statsFunctions}.
	 * @param ctx the parse tree
	 */
	void enterStatsFunctions(AsplParser.StatsFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#statsFunctions}.
	 * @param ctx the parse tree
	 */
	void exitStatsFunctions(AsplParser.StatsFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#statsFunction}.
	 * @param ctx the parse tree
	 */
	void enterStatsFunction(AsplParser.StatsFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#statsFunction}.
	 * @param ctx the parse tree
	 */
	void exitStatsFunction(AsplParser.StatsFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(AsplParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(AsplParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#primaryBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryBooleanExpression(AsplParser.PrimaryBooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#primaryBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryBooleanExpression(AsplParser.PrimaryBooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AsplParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AsplParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(AsplParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(AsplParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(AsplParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(AsplParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(AsplParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(AsplParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AsplParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AsplParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(AsplParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(AsplParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(AsplParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(AsplParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsplParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(AsplParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsplParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(AsplParser.PrimaryContext ctx);
}