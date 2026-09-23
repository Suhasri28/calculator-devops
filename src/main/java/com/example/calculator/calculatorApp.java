package com.example.calculator;

public class calculatorApp {

    public static void main(String[] args) {

        calculator calculator = new calculator();

        System.out.println("========================");
        System.out.println("      Calculator App");
        System.out.println("========================");

        System.out.println("10 + 5 = " + calculator.add(10, 5));
        System.out.println("10 - 5 = " + calculator.subtract(10, 5));
        System.out.println("10 * 5 = " + calculator.multiply(10, 5));
        System.out.println("10 / 5 = " + calculator.divide(10, 5));

        System.out.println("========================");
    }
}