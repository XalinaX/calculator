package com.taj.calcengine.fundamental;

public enum TokenType {
    NONE, NUM, OPRL1, OPRL2, OPAREN, CPAREN, FUNC, ODLM, CDLM, VAR;

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
        case '+':
        case '-':
            return TokenType.OPRL1;
        case '*':
        case '/':
            return TokenType.OPRL2;
        default:
            throw new IllegalArgumentException();
        }
    }

    //FIXME: wrong logic
//    public boolean checkNextTok(TokenType tNext) {
//        switch (this) {
//            case NONE:
//            case OPR:
//            case OPAREN:
//            case ODLM:
//            case FUNC:
//                return tNext != TokenType.CPAREN && tNext != TokenType.OPR && tNext != TokenType.NONE;
//            case NUM:
//                return tNext != TokenType.NUM;
//            case CDLM:
//            case CPAREN:
//            case VAR:
//                return tNext != TokenType.NUM && tNext != TokenType.VAR;
//            default:
//                throw new IllegalArgumentException("???");
//        }
//    }
}
