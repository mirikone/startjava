public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerFirst = new Jaeger("Cherno Alpha", 3, 10, 10, 280, 2.412f, "Разрушен");
        Jaeger jaegerSecond = new Jaeger("Romeo Blue", 2, 7, 6, 255, 7.775f, "Разрушен");

/*        jaegerFirst.setName("Cherno Alpha");
        jaegerFirst.setSpeed(3);
        jaegerFirst.setStrength(10);
        jaegerFirst.setArmor(10);
        jaegerFirst.setHeight(280);
        jaegerFirst.setWeight(2.412f);
        jaegerFirst.setStatus("Разрушен");*/

/*        jaegerSecond.setName("Romeo Blue");
        jaegerSecond.setSpeed(2);
        jaegerSecond.setStrength(7);
        jaegerSecond.setArmor(6);
        jaegerSecond.setHeight(255);
        jaegerSecond.setWeight(7.775f);
        jaegerSecond.setStatus("Разрушен");*/

        jaegerFirst.setName("Belo-Cherno Alpa");
        System.out.println("Наименование первого робота = " + jaegerFirst.getName());
        System.out.println("Наименование второго робота = " + jaegerSecond.getName());

        System.out.println("Показатели скорости первого робота = " + jaegerFirst.getSpeed());
        System.out.println("Показатели скорости второго робота = " + jaegerSecond.getSpeed());

        System.out.println("Показатели силы первого робота = " + jaegerFirst.getStrength());
        System.out.println("Показатели силы второго робота = " + jaegerSecond.getStrength());

        System.out.println("Показатели силы первого робота = " + jaegerFirst.getStrength());
        System.out.println("Показатели силы второго робота = " + jaegerSecond.getStrength());

        System.out.println("Показатели брони первого робота = " + jaegerFirst.getArmor());
        System.out.println("Показатели брони второго робота = " + jaegerSecond.getArmor());

        System.out.println("Рост первого робота= " + jaegerFirst.getHeight());

        if(jaegerFirst.getHeight() > jaegerSecond.getHeight()) {
            jaegerSecond.setHeight(290);
        } else {
            jaegerSecond.getHeight();
        }
        System.out.println("Рост второго робота = " + jaegerSecond.getHeight());

        System.out.println("Вес первого робота = " + jaegerFirst.getWeight());
        System.out.println("Вес второго робота = " + jaegerFirst.getWeight());

        System.out.println("Состояние первого робота = " + jaegerFirst.getStatus());
        System.out.println("Состояние второго робота = " + jaegerSecond.getStatus());
    }
}