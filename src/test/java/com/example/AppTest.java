package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testSimpleInterest() {
        assertEquals(150.0, App.simpleInterest(1000, 5, 3), 0.001);
    }

    @Test
    public void testAnotherCalculation() {
        assertEquals(400.0, App.simpleInterest(2000, 10, 2), 0.001);
    }

    @Test
    public void testZeroPrincipal() {
        assertEquals(0.0, App.simpleInterest(0, 5, 3), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativePrincipal() {
        App.simpleInterest(-1000, 5, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeRate() {
        App.simpleInterest(1000, -5, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeTime() {
        App.simpleInterest(1000, 5, -3);
    }
}
// Intentional failing test cases for Jenkins demonstration
// Intentional failure test for Jenkins
