package com.alog.aspl.grammar.antlr.visitors.search;

import static org.elasticsearch.index.query.QueryBuilders.boolQuery;

import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import com.alog.aspl.PqlBaseVisitor;
import com.alog.aspl.PqlParser.SearchStatementContext;
import com.alog.aspl.PqlParser.SearchStatementsContext;

public class SearchStatementsQueryVisitor extends PqlBaseVisitor<QueryBuilder> {

    @Override
    public QueryBuilder visitSearchStatements(SearchStatementsContext ctx) {
        BoolQueryBuilder queryBuilder = boolQuery();
        for (SearchStatementContext statementContext : ctx.searchStatement()) {
            queryBuilder.must(new SearchStatementQueryVisitor().visitSearchStatement(statementContext));
        }
        return queryBuilder;
    }

}
