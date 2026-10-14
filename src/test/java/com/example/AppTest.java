package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testSimpleInterest() {
        assertEquals(150.0, App.simpleInterest(1000.0, 5.0, 3.0), 0.001);
    }

    @Test
    public void testZeroPrincipal() {
        assertEquals(0.0, App.simpleInterest(0.0, 5.0, 3.0), 0.001);
    }

    @Test
    public void testZeroRate() {
        assertEquals(0.0, App.simpleInterest(1000.0, 0.0, 3.0), 0.001);
    }
}
