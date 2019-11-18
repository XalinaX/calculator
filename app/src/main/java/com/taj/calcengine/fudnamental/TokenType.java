package com.taj.calcengine.fudnamental;

public enum TokenType {
    NONE, NUM, OPR, OPAREN, CPAREN, FUNC, ODLM, CDLM, VAR;

    public static TokenType charToTok(char c) {
        switch (c) {
            case '(':
                return TokenType.OPAREN;
            case ')':
                return TokenType.CPAREN;
            case '{':
                return TokenType.ODLM;
            case '}':
                return TokenType.CDLM;
            default:
                throw new IllegalArgumentException();
        }
    }

    //FIXME: wrong logic
    public boolean checkNextTok(TokenType tNext) {
        switch (this) {
            case NONE:
            case OPR:
            case OPAREN:
            case ODLM:
            case FUNC:
                return tNext != TokenType.CPAREN && tNext != TokenType.OPR && tNext != TokenType.NONE;
            case NUM:
                return tNext != TokenType.NUM;
            case CDLM:
            case CPAREN:
            case VAR:
                return tNext != TokenType.NUM && tNext != TokenType.VAR;
            default:
                throw new IllegalArgumentException("???");
        }
    }
}
