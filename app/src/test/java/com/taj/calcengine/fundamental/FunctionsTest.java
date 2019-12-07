package com.taj.calcengine.fundamental;

import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionsTest {

    @Test(expected = ArithmeticException.class)
    public void pow() {
        Rational r = new Rational(4, 9);
        Rational power = new Rational(3);
        Rational[] arr = {r, power};

        assertEquals(new Rational(64, 729),Functions.pow(arr));

        power = new Rational(1, 2);
        arr[1] = power;
        assertEquals(new Rational(2, 3), Functions.pow(arr));

        power = new Rational(1, 3);
        arr[1] = power;
        assertEquals(Math.pow(4.0 / 9, 1.0 / 3), Functions.pow(arr).toDouble(), 0.0001);

        power = new Rational(2, 3);
        arr[1] = power;
        assertEquals(Math.pow(4.0 / 9, 2.0 / 3), Functions.pow(arr).toDouble(), 0.0001);

        power = new Rational(-2, 1);
        arr[1] = power;
        assertEquals(new Rational(81, 16), Functions.pow(arr));

        r = new Rational(-1, 2);
        power = new Rational(1, 2);
        arr[0] = r;
        arr[1] = power;

        // this is expected to throw
        assertEquals(new Rational(81, 16), Functions.pow(arr));
    }

    @Test(expected = ArithmeticException.class)
    public void pow2() {
        Rational r = Rational.zero();
        Rational power = new Rational(-1);
        Functions.pow(new Rational[] {r, power});
    }
}