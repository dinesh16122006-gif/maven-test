package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testStringPalindrome() {
        assertTrue(App.isPalindrome("madam"));
        assertFalse(App.isPalindrome("hello"));
    }

    @Test
    public void testNullString() {
        assertFalse(App.isPalindrome(null));
    }
}
