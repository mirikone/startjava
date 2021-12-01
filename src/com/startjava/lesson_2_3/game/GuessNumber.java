package com.startjava.lesson_2_3.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private int randomNumber;
    private Player firstPlayer;
    private Player secondPlayer;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        Random secretNumber = new Random();
        randomNumber = secretNumber.nextInt(101);
        System.out.println(randomNumber);
        do {
            inputNumber(firstPlayer);
            if(compareNumbers(firstPlayer)) {
                break;
            }
            inputNumber(secondPlayer);
            if(compareNumbers(secondPlayer)) {
                break;
            }
        } while(true);
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + " - Введите угадываемое число: ");
        player.setNumber(scanner.nextInt());
    }

    private boolean compareNumbers(Player player) {
        if (player.getNumber() == randomNumber) {
            System.out.println(player.getName() + "- Поздравляю, число угадано");
            return true;
        } else if (player.getNumber() < randomNumber) {
            System.out.println("Данной число меньше того, что загадал компьютер");
        } else {
            System.out.println("Данной число больше того, что загадал компьютер");
        }
        return false;
    }
}