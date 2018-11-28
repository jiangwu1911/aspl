package com.alog.aspl.grammar;

import static com.alog.aspl.grammar.antlr.visitors.SectionsVisitor.sections;
import static com.alog.aspl.grammar.antlr.visitors.search.SearchStatementVisitors.searchStatementsToQuery;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.client.node.NodeClient;
import org.elasticsearch.index.query.QueryBuilder;
import com.alog.aspl.grammar.antlr.PqlAntlrErrorListener;
import com.alog.aspl.grammar.antlr.PqlAntlrErrorStrategy;
import com.alog.aspl.PqlLexer;
import com.alog.aspl.PqlParser;

public class PqlQuery {

    public QueryBuilder buildQuery(String query) {
        try {
            return searchStatementsToQuery(buildAntlrParser(query).searchStatements());
        } catch (PqlException e) {
            throw e;
        } catch (Exception e) {
            throw new PqlException(e.getMessage(), e);
        }
    }

    public SearchRequestBuilder buildRequest(String query, NodeClient client) {
       /* ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new PlqlBaseListener(), tree);*/
        try {
            return sections(client, buildAntlrParser(query).sections());
        } catch (PqlException e) {
            throw e;
        } catch (Exception e) {
            throw new PqlException(e.getMessage(), e);
        }
    }

    private PqlParser buildAntlrParser(String query) {
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(query);
        PqlLexer lexer = new PqlLexer(antlrInputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PqlParser parser = new PqlParser(tokens);
        // parser.removeErrorListeners();
        parser.addErrorListener(new PqlAntlrErrorListener());
        parser.setErrorHandler(new PqlAntlrErrorStrategy());
        return parser;
    }
}
