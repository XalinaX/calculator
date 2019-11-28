package com.taj.calcengine;

import com.taj.calcengine.lex.LexResult;
import com.taj.calcengine.lex.TextLexer;

public class Main {
    public static void main(String[] args) {
        Arithmetic test = new Arithmetic();

        System.out.println(test.calc("1+2*3"));
    }
}
