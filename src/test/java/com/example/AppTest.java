package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testFibonacci() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 3}, App.fibonacci(5));
    }

    @Test
    public void testZero() {
        assertArrayEquals(new int[]{}, App.fibonacci(0));
    }

    @Test
    public void testOne() {
        assertArrayEquals(new int[]{0}, App.fibonacci(1));
    }
}
