package com.taj.calcengine.fudnamental;

public enum TokenType {
    NONE, NUM, OPR, OPAREN, CPAREN, FUNC, VAR;

    public boolean checkNextTok(TokenType tNext) {
        switch (this) {
            case NONE:
            case OPR:
            case OPAREN:
            case FUNC:
                return tNext != TokenType.CPAREN && tNext != TokenType.OPR && tNext != TokenType.NONE;
            case NUM:
                return tNext != TokenType.NUM;
            case CPAREN:
            case VAR:
                return tNext != TokenType.NUM && tNext != TokenType.VAR;
            default:
                throw new IllegalArgumentException("???");
        }
    }
}
