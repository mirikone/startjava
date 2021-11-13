public class MyFirstGame {
    public static void main(String[] args) {
        //Загаданной число компьютером [0...100]
        int randomNumber = 60;
        for (int i = 1; i <= 100; i++) {
            if (i == randomNumber) {
            System.out.println("Поздравляю, число угадано");
            break;
            } else if (i > randomNumber) {
                        System.out.println("Данной число больше того, что загадал компьютер");
            } else {
                System.out.println("Данной число меньше того, что загадал компьютер");
            }
        }
    }
}