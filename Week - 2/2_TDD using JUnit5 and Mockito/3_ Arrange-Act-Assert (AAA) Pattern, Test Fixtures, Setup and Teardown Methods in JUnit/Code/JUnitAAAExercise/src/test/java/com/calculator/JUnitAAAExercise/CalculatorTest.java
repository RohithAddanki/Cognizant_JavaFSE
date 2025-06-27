package com.calculator.JUnitAAAExercise;

//This is the Junit Test Class

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup complete.");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown complete.");
    }

    @Test
    public void testAddUsingAAA() {
        // Arrange
        int a = 5;
        int b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testAddZeroUsingAAA() {
        // Arrange
        int a = 0;
        int b = 7;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(7, result);
    }
}
