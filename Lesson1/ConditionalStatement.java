public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 22;
        if (age > 20) {
            System.out.println("Тебе больше 20 лет");
        }

        char sex = 'M';
        if (sex == 'M') {
        System.out.println("Ты представитель мужского пола");
        } else if (sex != 'M') {
            System.out.println("Ты представитель женского пола");
        }

        float height = 1.75f;
        if (height < 1.80f) {
            System.out.println("Рост меньше 1.8 метра");
        } else {
            System.out.println("Рост больше 1.8 метра");
        }

        char firstLetterName = 'M';
        if (firstLetterName == 'M') {
            System.out.println("Первая буква твоего имени 'M'");
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква твоего имени 'I'");
        } else {
            System.out.println("Первая буква твоего имени неизвестно");
        }
    }
}