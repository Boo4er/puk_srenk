package org.example.core;

import org.example.Calculator;
import org.example.Rosha;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;

class CalculatorTest {

    private Rosha calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Проверка сложения 2 + 3 = 5")
    void testAdd() {
        assertThat(calculator.add(2, 3)).isEqualTo(5);
    }

    @Test
   @DisplayName("Проверка вычитания 5 - 3 = 2")
    void testSubtract() {
       assertThat(calculator.subtract(5, 3)).isEqualTo(2);
    }

    @Test
    @DisplayName("Проверка умножения 2 * 3 = 6")
    void testMultiply() {
        assertThat(calculator.multiply(2, 3)).isEqualTo(6);
    }


    @Test
    @DisplayName("Проверка деления 6 / 3 = 2")
    void testDivide() {
        assertThat(calculator.divide(6, 3)).isEqualTo(2.0);
    }

    @Test
    @DisplayName("Проверка деления на ноль")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(6, 0));
    }
}