package com.alog.aspl.grammar.antlr.visitors.search;

import org.elasticsearch.index.query.QueryBuilder;
import com.alog.aspl.PqlParser.SearchStatementContext;
import com.alog.aspl.PqlParser.SearchStatementsContext;

public class SearchStatementVisitors {

    public static QueryBuilder searchStatementToQuery(SearchStatementContext ctx) {
        return new SearchStatementQueryVisitor().visitSearchStatement(ctx);
    }


    public static QueryBuilder searchStatementsToQuery(SearchStatementsContext ctx) {
        return new SearchStatementsQueryVisitor().visitSearchStatements(ctx);
    }

}
