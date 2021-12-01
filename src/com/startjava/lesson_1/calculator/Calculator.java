package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 2;
        char symbol = '^';
        int result = 0;
        if(symbol == '+') {
            result = firstNumber + secondNumber;
        } else if(symbol == '-') {
            result = firstNumber - secondNumber;
        } else if(symbol == '*') {
            result = firstNumber * secondNumber;
        } else if(symbol == '%') {
            result = firstNumber % secondNumber;
        } else if(symbol == '^') {
            result = 1;
            while(secondNumber > 0) {
                result *= firstNumber;
                secondNumber--;
            }
        } else if(symbol == '/') {
            result = firstNumber / secondNumber;
        } 
        System.out.println(result);
    }
}