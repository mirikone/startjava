public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfBeast = new Wolf();
        wolfBeast.nickname = "Pedro";
        wolfBeast.sex = 'M';
        wolfBeast.weight = 42.6f;
        wolfBeast.age = 10;
        wolfBeast.color = "grey";

        System.out.println(wolfBeast.nickname);
        System.out.println(wolfBeast.sex);
        System.out.println(wolfBeast.weight);
        System.out.println(wolfBeast.age);
        System.out.println(wolfBeast.color);

        wolfBeast.move();
        wolfBeast.sit();
        wolfBeast.run();
        wolfBeast.howl();
        wolfBeast.hunt();
    }
}