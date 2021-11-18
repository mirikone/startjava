public class Calculator {

    private int firstNumber;
    private char symbol;
    private int secondNumber;
    private int result ;
    private char reply;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
        switch(symbol) {
            case '+':
                result = firstNumber + secondNumber;
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

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
    public char getReply() {
        return reply;
    }

    public void setReply(char reply) {
        this.reply = reply;
    }
}