package com.taj.calcengine;

import com.taj.calcengine.fudnamental.Rational;
import com.taj.calcengine.fudnamental.TokenType;
import com.taj.calcengine.lex.LexResult;

import java.util.ArrayList;

public class Arithmetic implements CalcEngine {
    private ArrayList<Rational> operands;
    private ArrayList<String> operators;
    private ArrayList<Integer> braceLim;

    @Override
    public Rational calc(String source) {
        clearAll();
        return Rational.zero();
    }

    private void parse(LexResult lx) {
        ArrayList<String> elems = lx.getElems();
        ArrayList<TokenType> types = lx.getTypes();


    }

    public void clearAll() {
        operands.clear();
        operators.clear();
        braceLim.clear();
    }


}
