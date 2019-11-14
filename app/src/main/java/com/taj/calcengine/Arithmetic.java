package com.taj.calcengine;

import com.taj.calcengine.fudnamental.Rational;
import com.taj.calcengine.fudnamental.TokenType;

import java.util.ArrayList;
import java.util.Scanner;

public class Arithmetic implements CalcEngine {

    private ArrayList<Rational> operands;
    private ArrayList<String> operators;
    private ArrayList<Integer> braceLim;

    @Override
    public Rational calc(String source) {
        clearAll();
        return Rational.zero();
    }

    private void parse(String source) {
        Scanner sc = new Scanner(source).useDelimiter("\\s*");
        TokenType lastTokenType = TokenType.NONE;

        for (char c; sc.hasNext();) {

        }
    }

    public void clearAll() {
        operands.clear();
        operators.clear();
        braceLim.clear();
    }


}
