package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfBeast = new Wolf();
        wolfBeast.setNickname("Pedro");
        wolfBeast.setSex('M');
        wolfBeast.setWeight(42.6f) ;
        wolfBeast.setAge(10);
        wolfBeast.setColor("grey");

        System.out.println(wolfBeast.getNickname());
        System.out.println(wolfBeast.getSex());
        System.out.println(wolfBeast.getWeight());
        System.out.println(wolfBeast.getAge());
        System.out.println(wolfBeast.getColor());

        wolfBeast.move();
        wolfBeast.sit();
        wolfBeast.run();
        wolfBeast.howl();
        wolfBeast.hunt();
    }
}