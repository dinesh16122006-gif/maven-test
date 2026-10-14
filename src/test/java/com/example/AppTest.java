package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testLargest() {
        assertEquals(10, App.largest(5, 10, 2));
    }
}
