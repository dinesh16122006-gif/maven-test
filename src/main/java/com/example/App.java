package com.example;

public class App {
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }
}
