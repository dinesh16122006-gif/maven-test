package com.example;

public class App {
    public static double simpleInterest(double principal, double rate, double time) {
        if (principal < 0 || rate < 0 || time < 0) {
            throw new IllegalArgumentException("Inputs cannot be negative");
        }
        return principal * rate * time / 100.0;
    }
}
