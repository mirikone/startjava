import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        char reply;
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Введите первое число: ");
            calc.setFirstNumber(scanner.nextInt());

            System.out.println("Введите второе число: ");
            calc.setSecondNumber(scanner.nextInt());

            System.out.println("Введите знак математической операции: ");
            calc.setSign(scanner.next().charAt(0));

            System.out.println("Ответ: " + calc.getResult());

            do {
                System.out.println("Хотите продолжить вычисления? [y/n]: ");
                reply = scanner.next().charAt(0);
                if(reply == 'n') {
                    break;
                }
            } while(reply !='y');

            if(reply == 'n') {
                break;
            }
        }
    }
}