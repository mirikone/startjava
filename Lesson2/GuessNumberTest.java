import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Первый игрок введите имя : ");
        String firstName = scanner.nextLine();
        Player firstPlayer = new Player(firstName);

        System.out.println("Второй игрок введите имя : ");
        String secondName = scanner.nextLine();
        Player secondPlayer = new Player(secondName);

        GuessNumber game = new GuessNumber(firstPlayer, secondPlayer);

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