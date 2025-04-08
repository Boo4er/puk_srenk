package org.example;

import java.util.Arrays;

public class StringLoops {

    private int count = 0;

    public void loop(String a) {
        System.out.println("Перебор символов");
        char c;
        for (int i = 0; i < a.length(); i++) {
            c = a.charAt(i);
            System.out.println(" symbol " + i + " : " + c);
        }
    }

    public void whileLoop() {
        while (count < 3) {
            //  count = count + 1;
            System.out.println("Счетчик whileLoop " + count);
            ++count;
        }
        count = 0;
    }

    public void dooWhileLoop() {
        do {
            count++;
            System.out.println("Счеткик doWhileLoop " + count);

        } while (count < 10);
    }

    public void forEachLoop() {
        String[] fruits = {"apple", "banana", "orange"};
        for (String fruit : fruits) {
            System.out.println(fruit);
            System.out.println(Arrays.toString(fruits));
        }
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Фрукт " + fruits[i]);
        }
    }

    public void unHollyLoop() {
        while (true) {
            System.out.println("Этот цикл будет работать вечно");
        }
    }
}
