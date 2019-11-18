package com.taj.calcengine.lex;

import org.junit.Assert;
import org.junit.Test;

public class TextLexerTest {
    TextLexer tx = new TextLexer("1+1");

    @Test
    public void nextToken() {
        Assert.assertEquals("1",tx.nextToken().elem);
    }
}