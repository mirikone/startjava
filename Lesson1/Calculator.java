public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 3;
        char symbol = '/';
        if(symbol == '+') {
            int equal = firstNumber + secondNumber;
        } else if(symbol == '-') {
            int equal = firstNumber - secondNumber;
            System.out.println(a);
        } else if(symbol == '*') {
            int equal = firstNumber * secondNumber;
            System.out.println(a);
        } else if(symbol == '/' & secondNumber != 0) {
            float equal = (float) firstNumber / secondNumber;
            System.out.println(equal);
        } else if(symbol == '%') {
            int equal = firstNumber % secondNumber;
            System.out.println(equal);
        } else if(symbol == '^') {
            int equal = 1;
            while(secondNumber > 0) {
                equal *= firstNumber;
                secondNumber--;
            }
            System.out.println(equal);
        } else {
            System.out.println("На ноль делить нельзя!");
        }
    }
}