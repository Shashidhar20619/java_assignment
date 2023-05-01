package com.javaprogram4.Dependency_Inversion;
public class Division implements Operation {
    @Override
    public int perform(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return x / y;
    }
}