package org.example;

class Calculator implements Rosha {

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
    public int minus(int a, int b) {
        return a - b;
    }
}

interface Rosha {

    public int minus(int a, int b);

    public int add(int a, int b);

}
