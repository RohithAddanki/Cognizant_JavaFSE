package com.calculator.test;

import org.junit.Test;

import com.calculator.Calculator;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdditionWorks() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.add(1, 9));
    }
}
