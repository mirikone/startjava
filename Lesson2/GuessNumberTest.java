import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Первый игрок введите имя : ");
        String nameFirst = scanner.nextLine();
        Player playerFirst = new Player(nameFirst);

        System.out.println("Второй игрок введите имя : ");
        String nameSecond = scanner.nextLine();
        Player playerSecond = new Player(nameSecond);

        GuessNumber start = new GuessNumber(playerFirst, playerSecond);

        String reply;
            do {
                start.playGame();
                do {
                    System.out.println("Хотите продолжить игру? [yes/no]: ");
                    reply = scanner.nextLine();
                } while(!reply.equals("yes") && !reply.equals("no"));
            } while(reply.equals("yes"));
        }
    }