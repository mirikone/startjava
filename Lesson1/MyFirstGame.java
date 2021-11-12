public class MyFirstGame {
    public static void main(String[] args) {
        int randomNumber = 60; //Загаданной число компьютером [0...100]
        while (true) {
            int inputNumber = 50; //Здесь должен быть ввод числа
            if (inputNumber == randomNumber) {
                System.out.println("Поздравляю, число угадано!");
                break;
            } else if (inputNumber > randomNumber) {
                System.out.println("Данной число больше того, что загадал компьютер");
                break;
            } else {
                System.out.println("Данной число меньше того, что загадал компьютер");
                break;
            }
        }
    }
}
