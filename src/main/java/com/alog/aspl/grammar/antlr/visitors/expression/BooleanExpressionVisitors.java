package com.alog.aspl.grammar.antlr.visitors.expression;

import org.elasticsearch.index.query.QueryBuilder;
import com.alog.aspl.PqlParser.BooleanExpressionContext;
import com.alog.aspl.grammar.antlr.visitors.expression.BooleanExpressionScriptVisitor.BooleanExpressionScript;

public abstract class BooleanExpressionVisitors {

    public static QueryBuilder booleanExpressionToQuery(BooleanExpressionContext ctx) {
        return new BooleanExpressionQueryVisitor().visitBooleanExpression(ctx);
    }

    public static BooleanExpressionScript booleanExpressionToScript(BooleanExpressionContext ctx) {
        return new BooleanExpressionScriptVisitor().visitBooleanExpression(ctx);
    }
}
