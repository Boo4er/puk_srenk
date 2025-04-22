package org.example.core.task;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();
    private int min = 1;
    private int max = 100;
    private int attempts = 0;
    private int maxAttempts = 7;
    private int secretNumber = random.nextInt(max - min + 1) + min;
    private boolean hasWon = false;
    private static String GREETING = "Добро пожаловать в игру 'Угадай число'!";
    private static String NUMBER_RANGE_MESSAGE = "Я загадал число от %d до %d. Попробуй угадать!\n";
    private static String ATTEMPTS_LEFT_MESSAGE = "У тебя есть %d опыток \n";
    private static String YOUR_CHOICE_MESSAGE = "Твой вариант.";
    private static String CONGRATULATION_MESSAGE = "Поздравляю ты угадал число %d за %d попыток!\n";
    private static String MORE_NUMBER_MESSAGE = "Мое число больше.";
    private static String LESS_NUMBER_MESSAGE = "Мое число меньше";
    private static String YOU_LOSE_MESSAGE = "Ты проиграл! Я загадал число %d.\n";

    public void run() {
        System.out.println(GREETING);
        System.out.printf(NUMBER_RANGE_MESSAGE, min, max);
        System.out.printf(ATTEMPTS_LEFT_MESSAGE, maxAttempts);
        handleUserGuesses();
        if (!hasWon) {
            System.out.printf(YOU_LOSE_MESSAGE, secretNumber);
        }
        scanner.close();
    }

    private void handleUserGuesses() {
        while (attempts < maxAttempts && !hasWon) {
            System.out.println(YOUR_CHOICE_MESSAGE);
            int guess = scanner.nextInt();
            attempts++;
            if (guess == secretNumber) {
                hasWon = true;
                System.out.printf(CONGRATULATION_MESSAGE, secretNumber, attempts);
            }
            if (guess < secretNumber) {
                System.out.println(MORE_NUMBER_MESSAGE);
            }
            if (guess > secretNumber) {
                System.out.println(LESS_NUMBER_MESSAGE);
            }
        }
    }
}
