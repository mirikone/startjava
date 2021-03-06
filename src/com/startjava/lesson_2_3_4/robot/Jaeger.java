package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    private final int speed;
    private final int strength;
    private final int armor;
    private String name;
    private int height;
    private final float weight;
    private final String status;

    public Jaeger(String name, int speed, int strength, int armor, int height, float weight, String status) {
        this.name = name;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
        this.height = height;
        this.weight = weight;
        this.status =status;
    }
    /**/
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

/*    public void setSpeed(int speed) {
        this.speed = speed;
    }*/

    public int getSpeed() {
        return speed;
    }

/*    public void setStrength(int strength) {
        this.strength = strength;
    }
*/
    public int getStrength() {
        return strength;
    }

/*    public void setArmor(int armor) {
        this.armor = armor;
    }*/

    public int getArmor() {
        return armor;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight () {
        return height;
    }

/*    public void setWeight(float weight) {
        this.weight = weight;
    }*/

    public float getWeight() {
        return weight;
    }
/*
    public void setStatus(String status) {
        this.status = status;
    }
*/
    public String getStatus() {
        return status;
    }
}