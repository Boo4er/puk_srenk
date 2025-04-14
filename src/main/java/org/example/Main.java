package org.example;

import org.example.core.task.ArraySum;

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
        int minusResult = calculator.subtract(3, 12);
        System.out.println(summResult);
        System.out.println(minusResult);

        Calculator field = new Calculator();
        System.out.println(field.getShopa());
        field.setShopa(1488);
        System.out.println(field.getShopa());

        Rosha sloshna = new Calculator();
        //  sloshna.divide(5, 0);

        StringLoops stringi = new StringLoops();
        stringi.loop("Перебор символов");
        stringi.whileLoop();
        stringi.dooWhileLoop();
        stringi.forEachLoop();
        // stringi.unHollyLoop();
        ArraySum summ = new ArraySum();
        int result = summ.arraysum(new int[]{2, 6, 8, 3, 5, 3});
        System.out.println("ArraySum " + result);
        //test
    }
}
