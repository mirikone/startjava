public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char sign;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calculate() {
        switch(sign) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '%': 
                System.out.println(firstNumber % secondNumber);
                break;
            case '^':
                int result = 1;
                while(secondNumber > 0) {
                    result *= firstNumber;
                    secondNumber--;
                }
                System.out.println(result);
                break;
            case '/' :
                System.out.println(firstNumber / secondNumber);
                break;
            default :
                System.out.println("Неверная операция");
                break;
        }
    }
}