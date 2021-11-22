import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player playerFirst;
    private Player playerSecond;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player playerFirst, Player playerSecond) {
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;
    }

    public void playGame() {
        Random secretNumber = new Random();
        int randomNumber = secretNumber.nextInt(100);
        while(true) {
            System.out.print(playerFirst.getName() + " - Введите угадываемое число: ");
            int numberFirst = scanner.nextInt();
            playerFirst.setNumber(numberFirst);
            if (numberFirst > randomNumber) {
                System.out.println("Данной число больше того, что загадал компьютер");
            } else if (numberFirst < randomNumber) {
                System.out.println("Данной число меньше того, что загадал компьютер");
            } else {
                System.out.println(playerFirst.getName() + "- Поздравляю, число угадано");
                break;
            }

            System.out.print(playerSecond.getName() + " - Введите угадываемое число: ");
            int numberSecond = scanner.nextInt();
            playerSecond.setNumber(numberSecond);
            if (numberSecond > randomNumber) {
                System.out.println("Данной число больше того, что загадал компьютер");
            } else if (numberSecond < randomNumber) {
                System.out.println("Данной число меньше того, что загадал компьютер");
            } else {
                System.out.println(playerSecond.getName() + "- Поздравляю, число угадано");
                break;
            }
        }
    }
}