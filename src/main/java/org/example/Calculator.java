package org.example;

public class Calculator implements Rosha {

    private int shopa = 10;

    public int getShopa() {
        return this.shopa;
    }

    public void setShopa(int a) {
        this.shopa = a;
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Idi nahoi");
        }
        return (double) a / b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}
