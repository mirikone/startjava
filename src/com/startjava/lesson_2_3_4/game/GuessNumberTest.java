package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Первый игрок введите имя : ");
        String firstName = scanner.nextLine();
        Player firstPlayer = new Player(firstName);

        System.out.print("Второй игрок введите имя : ");
        String secondName = scanner.nextLine();
        Player secondPlayer = new Player(secondName);

        System.out.print("Третий игрок введите имя : ");
        String thirdName = scanner.nextLine();
        Player thirdPlayer = new Player(thirdName);

        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer, thirdPlayer);

        game.fate();
        String reply;
        do {
            game.start();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                reply = scanner.nextLine();
            } while(!reply.equals("yes") && !reply.equals("no"));
        } while(reply.equals("yes"));
    }
}