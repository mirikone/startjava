import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private boolean isWin;
    private int randomNumber;
    private Player firstPlayer;
    private Player secondPlayer;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void start() {
        isWin = false;
        Random secretNumber = new Random();
        randomNumber = secretNumber.nextInt(100);
        while(!isWin) {
            inputNumber(firstPlayer);
            playAlmost(firstPlayer);
            if(isWin == true) {
                break;
            }
            inputNumber(secondPlayer);
            playAlmost(secondPlayer);
        }
    }

    public void inputNumber(Player player) {
            System.out.print(player.getName() + " - Введите угадываемое число: ");
            player.setNumber(scanner.nextInt());
    }

    public void playAlmost(Player player) {
        if (player.getNumber() == randomNumber) {
            System.out.println(player.getName() + "- Поздравляю, число угадано");
            isWin = true;
        } else if (player.getNumber() < randomNumber) {
            System.out.println("Данной число меньше того, что загадал компьютер");
        } else {
            System.out.println("Данной число больше того, что загадал компьютер");
        }
    }
}