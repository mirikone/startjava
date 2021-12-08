package com.startjava.lesson_2_3_4.calculator;
public class Calculator {
    public int calculate(String expression) {
        String[] exp = expression.split(" ");
        int firstNumber = Integer.parseInt(exp[0]);
        char sign = exp[1].charAt(0);
        int secondNumber = Integer.parseInt(exp[2]);

        switch(sign) {
            case '+':
                return Math.addExact(firstNumber, secondNumber);
            case '-':
                return Math.subtractExact(firstNumber, secondNumber);
            case '*':
                return Math.multiplyExact(firstNumber, secondNumber);
            case '%':
                return Math.floorMod(firstNumber, secondNumber);
            case '^':
                return (int)Math.pow(firstNumber, secondNumber);
            case '/' :
                return Math.floorDiv(firstNumber, secondNumber);
            default :
                return 0;
        }
    }
}