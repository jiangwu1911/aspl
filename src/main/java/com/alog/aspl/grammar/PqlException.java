package com.alog.aspl.grammar;

import static com.alog.aspl.grammar.antlr.PqlAntlrErrorListener.formatMessage;

import org.antlr.v4.runtime.Token;

public class PqlException extends RuntimeException {

    public PqlException(String message) {
        super(message);
    }

    public PqlException(Token token, String message) {
        super(formatMessage(token.getLine(), token.getCharPositionInLine(), message));
    }

    public PqlException(String message, Throwable cause) {
        super(message, cause);
    }
}
