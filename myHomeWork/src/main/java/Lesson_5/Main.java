package Lesson_5;


public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        appleBox.addFruit(new Apple(), 30);
        orangeBox.addFruit(new Orange(), 25);
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        System.out.println("Начальный вес коробок: ");
        System.out.println("Яблоки: " + appleBox.getWeight());
        System.out.println("Апельсины: " + orangeBox.getWeight());
        System.out.println("Вес коробок одинаков: " + appleBox.compare(orangeBox));
        appleBox.pour(appleBox2);
        System.out.println("После пересыпания яблок:");
        System.out.println("Начальная коробка: " + appleBox.getWeight());
        System.out.println("Коробка, в которую пересыпали: " + appleBox2.getWeight());
        orangeBox.pour(orangeBox2);
        System.out.println("После пересыпания апельсинов:");
        System.out.println("Начальная коробка: " + orangeBox.getWeight());
        System.out.println("Коробка, в которую пересыпали: " + orangeBox2.getWeight());
    }
}
