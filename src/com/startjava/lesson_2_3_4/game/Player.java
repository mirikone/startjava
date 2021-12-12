package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private final String[] names = new String[2];
    private final int[] numbers = new int[10];
    private int step;
    private int numerator;

    public Player(String name) {
        names[numerator] = name;
    }

    public String getName() {
        return names[numerator];
    }

    public int getNumber() {
        return numbers[step - 1];
    }

    public void setNumber(int number) {
        numbers[step - 1] = number;
    }

    public int getStep() {
        return step;
    }
    public void setStep(int step) {
        this.step = step;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, step);
    }

    public void clearArray() {
        Arrays.fill(numbers, 0, step, 0);
    }
}
