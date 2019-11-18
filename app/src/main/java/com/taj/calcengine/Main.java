package com.taj.calcengine;

import com.taj.calcengine.fudnamental.Rational;
import com.taj.calcengine.lex.LexResult;
import com.taj.calcengine.lex.TextLexer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TextLexer tl = new TextLexer("1+2+\\frac{1}{2}");
        LexResult lr = new LexResult(tl);
        System.out.println(lr.getElems());
    }
}
