package com.example.springdocker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyMathCalcTest {
    private final MyMathCalc mathCalc = new MyMathCalc();
    int a = 5;
    int b = 2;
    int o = 0;


    @Test
    void addTest() {
        assertEquals(mathCalc.add(a, b), 7);
    }
    @Test
    void multiplyTest() {
        assertEquals(mathCalc.multiply(a, b), 10);
    }
    @Test
    void divideTest() {
        assertEquals(mathCalc.divide(a, b), 2.5);
    }
}
