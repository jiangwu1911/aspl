package com.alog.aspl.grammar.antlr.visitors.search;

import static com.alog.aspl.grammar.antlr.visitors.expression.BooleanExpressionVisitors.booleanExpressionToQuery;

import org.elasticsearch.index.query.QueryBuilder;
import com.alog.aspl.PqlBaseVisitor;
import com.alog.aspl.PqlParser.SearchStatementContext;

public class SearchStatementQueryVisitor extends PqlBaseVisitor<QueryBuilder> {

    @Override
    public QueryBuilder visitSearchStatement(SearchStatementContext ctx) {
        return booleanExpressionToQuery(ctx.booleanExpression());
    }
}
