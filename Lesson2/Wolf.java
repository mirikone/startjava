public class Wolf {

    char sex;
    String nickname;
    float weight;
    int age;
    String color;

    void move() {
        System.out.println("Ходит");
    }

    void sit() {
        System.out.println("Сидит");
    }

    void run() {
        System.out.println("Бежит");
    }

    void howl() {
        System.out.println("Воет");
    }

    boolean hunt() {
        System.out.println("Охотится");
        return true;
    }
}