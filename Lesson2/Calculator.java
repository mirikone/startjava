public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char sign;
    private int result;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }


    public void calculate(char sign) {
        switch(sign) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println(result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '%': 
                result = firstNumber % secondNumber;
                break;
            case '^':
                result = 1;
                while(secondNumber > 0) {
                    result *= firstNumber;
                    secondNumber--;
                }
                break;
            case '/' :
                result = firstNumber / secondNumber;
                break;
            default :
                System.out.println("Неверная операция");
                break;
        }
    }

    public int getResult() {
        return result;
    }

}