package org.example;

public class StringLoops {
    public void loop(String a) {
        System.out.println("Перебор символов");
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            System.out.println(" symbol " + i + " : " + c);
        }
    }
}
