package com.alog.aspl.grammar.antlr.visitors.literal;

import static com.alog.aspl.grammar.antlr.visitors.literal.LiteralVisitors.stringLiteralToString;

import com.alog.aspl.PqlBaseVisitor;
import com.alog.aspl.PqlParser.FloatLiteralContext;
import com.alog.aspl.PqlParser.IntegerLiteralContext;
import com.alog.aspl.PqlParser.StringLiteralContext;

class LiteralObjectVisitor extends PqlBaseVisitor<Object> {

    @Override
    public Long visitIntegerLiteral(IntegerLiteralContext ctx) {
        return Long.parseLong(ctx.getText());
    }

    @Override
    public Float visitFloatLiteral(FloatLiteralContext ctx) {
        return Float.parseFloat(ctx.getText());
    }

    @Override
    public String visitStringLiteral(StringLiteralContext ctx) {
        return stringLiteralToString(ctx);
    }
}
