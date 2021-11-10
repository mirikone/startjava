public class ConditionalStatement{
    public static void main(String[] args) {
    int age = 22;
    char sex = 'M';
    float height = 1.75f;
    char firstletter = 'M';
    if (age > 20) {
        System.out.println("Тебе больше 20 лет");
    }
    if (sex == 'M') {
        System.out.println("Ты представитель мужского пола");
    }
    if (sex != 'M') {
        System.out.println("Ты представитель женского пола");
    }
    if (height < 1.80f) {
        System.out.println("Рост меньше 1.8 метра");
    } else {
        System.out.println("Рост больше 1.8 метра");
    }
    if (firstletter == 'M') {
        System.out.println("Первая буква твоего имени M");
    } else if (firstletter == 'I') {
        System.out.println("Первая буква твоего имени I");
    } else {
        System.out.println("Первая буква твоего имени неизвестно");
    }
    }
}