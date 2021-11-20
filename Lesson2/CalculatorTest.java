import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String reply = "yes";
        while(reply.equals("yes")) {
            System.out.println("Введите первое число: ");
            calc.setFirstNumber(scanner.nextInt());

            System.out.println("Введите второе число: ");
            calc.setSecondNumber(scanner.nextInt());

            System.out.println("Введите знак математической операции: ");
            calc.setSign(scanner.next().charAt(0));
            scanner.nextLine();

            System.out.print("Ответ: ");
            calc.calculate();
            
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                reply = scanner.nextLine();
            } while(!reply.equals("yes") && !reply.equals("no"));
        }
    }
}