
public class Cycle {
    public static void main(String []args) {
        for(int i = 0; i<=20; i++) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        int x = 6;
        while(x >= -6) {
            System.out.print(x + " ");
            x = x - 2;
        }

        System.out.println(" ");
        int num = 0;
        int y = 10;
        do {
            if (y % 2 == 1) {
                num = y + num;
            }
            y++;
        }while (y <= 20);
        System.out.print(num);
    }
}