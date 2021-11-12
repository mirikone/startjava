public class Calculator {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        char s = '/';
        if(s == '+') {
            int a = x + y;
        } else if(s == '-') {
            int a = x - y;
            System.out.println(a);
        } else if(s == '*') {
            int a = x * y;
            System.out.println(a);
        } else if(s == '/' & y != 0) {
            float a = (float) x / y;
            System.out.println(a);
        } else if(s == '%') {
            int a = x % y;
            System.out.println(a);
        } else if(s == '^') {
            int a = 1;
            while(y > 0) {
                a = a * x;
                y--;
            }
            System.out.println(a);
        } else {
            System.out.println("На ноль делить нельзя!");
        }
    }
}