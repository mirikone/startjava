package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class GuessNumber {
    private int randomNumber;
    private final Player firstPlayer;
    private final Player secondPlayer;
    private final Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        Random secretNumber = new Random();
        randomNumber = secretNumber.nextInt(101);
        System.out.println(randomNumber);
        for(int i = 1; i <= 10; i++) {
            firstPlayer.setStep(i);
            if (countStep(firstPlayer)) {
                break;
            }
            secondPlayer.setStep(i);
            if (countStep(secondPlayer)) {
                break;
            }
        }
        System.out.println("Числа " + firstPlayer.getName() + " :" + Arrays.toString(firstPlayer.getNumbers()));
        firstPlayer.clearArray();
        System.out.println("Числа " + secondPlayer.getName() + " :" + Arrays.toString(secondPlayer.getNumbers()));
        secondPlayer.clearArray();
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + " - Введите угадываемое число: ");
        player.setNumber(scanner.nextInt());
    }

    private boolean countStep(Player player) {
        inputNumber(player);
        if(!compareNumbers(player)) {
            if(player.getStep() == 10) {
                System.out.println("У " + player.getName() + " закончились попытки");
            }
            return false;
        } else {
            return true;
        }
    }


    private boolean compareNumbers(Player player) {
        if (player.getNumber() == randomNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " c " + player.getStep() + " попытки!");
            return true;
        } else if (player.getNumber() < randomNumber) {
            System.out.println("Данной число меньше того, что загадал компьютер");
        } else {
            System.out.println("Данной число больше того, что загадал компьютер");
        }
        return false;
    }
}