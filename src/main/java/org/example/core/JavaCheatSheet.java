package org.example.core;

import org.example.Calculator;
import org.example.Rosha;

import java.util.Arrays;

public class JavaCheatSheet {
    /**
     * примитивные типы данных - 8 штук!
     */
    boolean booleanDefaultValue = false;
    char charDefaultValue = ' ';
    int intDefaultValue = 0;
    //byte short long float double

    /**
     * непримитивные типы данных - 4 штуки!
     */
    String str = "'это тип данных Стринг";
    String[] strArray = {"это", "массив", "из строк"};
    Calculator linkToYourOwnClassWithClassType = new Calculator();
    Rosha linkToYourOwnClassWithInterfaceType = new Calculator();

    /**
     * операторы арифметические  - резульат число
     * сумма +
     * отнять -
     * разделить /
     * умножить *
     * остаток от деления %
     */
    int a = 1;
    int b = 5;
    int sum = a + b;

    /**
     * операторы сравнения  - результат true / false
     * пихаем в конструкцию if(*условие*) {...}
     * меньше <
     * больше >
     * меньше или равно <=
     * больше или равно >=
     * равно ==
     * не равно !=
     */
    void someMethod1() {
        boolean result1 = false;
        if (a < b) {
            result1 = !result1; // перезаписали на противоположное значение
        }
    }

    /**
     * Переменные в зависимости от места объявления бывают
     * локальные -  в конструкторе, методе, init блоке (выполняется перед конструктором)
     * глобальные -  в поле класса (без private), а если private то по другому на русском называются
     * статические - ключевое слово static, не может быть локальной!
     */
    class Variable { // Это класс

        {
            //это блок инициальзации
            int localVariable1 = 100;
        }

        Variable() {
            //это конструктор класса, имя как у класса, с большой буквы
            int localVariable2 = 200;
        }

        int globalVariable = 300; // плохаааа
        static int staticGlobalVariable = 300; // плохаааа

        private int instanceVariable = 400; // доступ из всех методов класса и не торчит наружу

        void someMethod1(){
            int localVariable3 = 500;
            instanceVariable = 600;
        }
        void someMethod2(){

            instanceVariable = 700;
        }
    }

    /**
     * Условия
     * if-else
     * switch
     */
    void methodIfElse() {
        boolean result1 = false;
        if (a < b) {
            // если условие выполняется (true) то выполнится этот блок кода
            result1 = !result1;
        }

        //если условие не выполняется то программа перейдет на эту строчку
    }

    /**
     * Циклы
     * for (условие) {...}
     * while (условие) {...}
     * do {...} while (условие)
     */
    void methodForLoop(){
        String str = "последовательность символов из которой будет браться по одному симводу на каждый проход цикла";
        for (int index = 0; index < 100; index++) { // 100 проходов цикла
            System.out.println("обрабатываемый символ в данный момент это" + str.charAt(index));
        }
        //подумать какая ошибка может выскочить и почему


        //А если это массив то с ним можно работать как с коллекцией! forEach
        String[] array = {"word1","word2", "word3"};
        for (String word  : array) {
            // делай что хочешь с каждым словом по отдельности
        }
    }

    /**
     * String class
     * immutable!
     */
    void doSomethingWithString(){
        String str = "Это ты знаешь";

        String str2 = new String();
        str2 = str; //это тоже же самое

        str.length();
        str.charAt(0);
        str.substring(3);
        str.substring(3, 5);
        str.concat(str2);
        str.indexOf('Э');
        str.toLowerCase();
        str.toUpperCase();
        str.replace('a', 'b');
        str.trim();
        str.equals(str2);
        str.equalsIgnoreCase(str2);

        //Для возможности изменения строк используем СтрингБуфер и СтрингБилдер - mutable!
        //СтрингБуффер - потокобезопасный и синхронизированный!
        StringBuffer sb = new StringBuffer("Hello jopa");
        sb.length();
        sb.capacity();//в чем разница?
        sb.deleteCharAt(5);
    }

    /**
     * Массивы
     */
    void doSomeThingWithArrays() {
        int[] numbers = new int[5]; //массив из пяти нулей
        String[] names = {"Жопа", "Жопка", "Новый год", "Привет"};

        //чтение
        String readFirst = names[0]; // "Жопа"
        //запись
        names[0] = "совмем что-то другое";

        int lenght = names.length;

        //переделать массив в строку
        String arrayString = Arrays.toString(names);
        String arrayString2 = names.toString();

        //многомерный массив
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;

    }

}
