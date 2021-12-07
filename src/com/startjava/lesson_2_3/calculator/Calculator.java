package com.startjava.lesson_2_3.calculator;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char sign;

    public void setExpression(String expression) {
        String[] exp = expression.split(" ");
        this.firstNumber = Integer.parseInt(exp[0]);
        this.sign = exp[1].charAt(0);
        this.secondNumber = Integer.parseInt(exp[2]);
    }

    public void calculate() {
        switch(sign) {
            case '+':
                System.out.println(Math.addExact(firstNumber, secondNumber));
                break;
            case '-':
                System.out.println(Math.subtractExact(firstNumber, secondNumber));
                break;
            case '*':
                System.out.println(Math.multiplyExact(firstNumber, secondNumber));
                break;
            case '%':
                System.out.println(Math.floorMod(firstNumber, secondNumber));
                break;
            case '^':
                System.out.println(Math.pow(firstNumber, secondNumber));
                break;
            case '/' :
                System.out.println(Math.floorDiv(firstNumber, secondNumber));
                break;
            default :
                System.out.println("Неверная операция");
                break;
        }
    }


}