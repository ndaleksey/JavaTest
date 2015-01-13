package com.junit;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals("Ошибка вываливающаяся в лог", 5 * 5, calculator.multiply(5, 5));
    }

    @Test
    public void testDivision() throws Exception {
        assertEquals(2.1, 5 / 2, 1);
    }
}