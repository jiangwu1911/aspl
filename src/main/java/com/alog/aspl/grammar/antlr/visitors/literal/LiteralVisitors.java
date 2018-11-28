package com.alog.aspl.grammar.antlr.visitors.literal;

import com.alog.aspl.PqlParser.IntegerLiteralContext;
import com.alog.aspl.PqlParser.LiteralContext;
import com.alog.aspl.PqlParser.StringLiteralContext;

public class LiteralVisitors {

    public static String literalToString(LiteralContext ctx) {
        return new LiteralStringVisitor().visitLiteral(ctx);
    }

    public static Long literalToInteger(IntegerLiteralContext ctx) {
        return new LiteralObjectVisitor().visitIntegerLiteral(ctx);
    }

    public static Object literalToObject(LiteralContext ctx) {
        return new LiteralObjectVisitor().visitLiteral(ctx);
    }

    public static String stringLiteralToString(StringLiteralContext ctx) {
        return new LiteralStringVisitor().visitStringLiteral(ctx);
    }
}
