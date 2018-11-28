package com.alog.aspl.grammar.antlr.visitors.sort;

import static com.alog.aspl.grammar.antlr.visitors.identifier.IdentifierVisitors.identifierToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.alog.aspl.PqlBaseVisitor;
import com.alog.aspl.PqlParser.SortFieldContext;
import com.alog.aspl.PqlParser.SortStatementContext;
import com.alog.aspl.grammar.antlr.visitors.sort.SortStatementVisitor.Sort;
import org.elasticsearch.search.sort.SortOrder;

public class SortStatementVisitor extends PqlBaseVisitor<List<Sort>> {

    public static List<Sort> sortStatement(SortStatementContext ctx) {
        return new SortStatementVisitor().visitSortStatement(ctx);
    }

    @Override
    public List<Sort> visitSortStatement(SortStatementContext ctx) {
        List<Sort> sortFields = new ArrayList<>();
        for (SortFieldContext sortFieldCtx : ctx.sortField()) {
            sortFields.addAll(visitSortField(sortFieldCtx));
        }
        return sortFields;
    }

    @Override
    public List<Sort> visitSortField(SortFieldContext ctx) {
        SortOrder sortOrder = SortOrder.ASC;
        if (ctx.T_DESC() != null) {
            sortOrder = SortOrder.DESC;
        }
        return Collections.singletonList(new Sort(identifierToString(ctx.IDENTIFIER()), sortOrder));
    }

    public static class Sort {

        private String field;
        private SortOrder sortOrder;

        public Sort(String field, SortOrder sortOrder) {
            this.field = field;
            this.sortOrder = sortOrder;
        }

        public String getField() {
            return field;
        }

        public SortOrder getSortOrder() {
            return sortOrder;
        }
    }
}
