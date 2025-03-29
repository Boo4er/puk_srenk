package org.example;

public class Main {

    public static void main(String[] args) {
        String govno = "Hello World puska!";
        String govno2 = "Hello govnishe";
        String govno3;
        govno3 = ("pidor baba ebanaya");
        System.out.println(govno);
        System.out.println(govno2);
        System.out.println(govno3);
        System.out.println(govno + govno2);
        System.out.println(govno + "pidor");

        Rosha calculator = new Calculator();
        int summResult = calculator.add(5, 6);
        int minusResult = calculator.minus(3, 12);
        System.out.println(summResult);
        System.out.println(minusResult);

        Calculator field = new Calculator();
        System.out.println(field.getShopa());
        field.setShopa(1488);
        System.out.println(field.getShopa());

    }
}
