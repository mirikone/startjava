public class MyFirstGame {
    public static void main(String[] args) {
        //Загаданной число компьютером [0...100]
        int randomNumber = 60;
        //Первоначальный ввод
        int inputNumber = 20;
        while (inputNumber != randomNumber) {
            if (inputNumber > randomNumber) {
                System.out.println("Данной число больше того, что загадал компьютер");
            } else if (inputNumber < randomNumber){
                System.out.println("Данной число меньше того, что загадал компьютер");
            } 
            //Последущий ввод чисел
            inputNumber = 30;
        } System.out.println("Поздравляю, число угадано!");
    }
}