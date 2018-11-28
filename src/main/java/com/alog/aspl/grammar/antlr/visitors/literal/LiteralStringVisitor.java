package com.alog.aspl.grammar.antlr.visitors.literal;

import com.alog.aspl.PqlBaseVisitor;
import com.alog.aspl.PqlParser.FloatLiteralContext;
import com.alog.aspl.PqlParser.IntegerLiteralContext;
import com.alog.aspl.PqlParser.StringLiteralContext;

class LiteralStringVisitor extends PqlBaseVisitor<String> {

    @Override
    public String visitIntegerLiteral(IntegerLiteralContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitFloatLiteral(FloatLiteralContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitStringLiteral(StringLiteralContext ctx) {
        return ctx.getText().substring(1, ctx.getText().length() - 1);
    }
}
