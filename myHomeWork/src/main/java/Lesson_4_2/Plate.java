package Lesson_4_2;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if (food>n) food -= n;
        else System.out.println("Мало еды");
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    }
class Cat {
    private String name;
    private int appetite;
    private int satiety;

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    public void satietyInfo() {
        System.out.println("Сытость " +name + " " +(satiety+appetite));
    }
}

class MainClass {
    public static void main(String[] args) {
        Cat[] c = new Cat[3];
        c[0] = new Cat("Barsik", 10, 0);
        c[1] = new Cat("Vasya", 5, 0);
        c[2] = new Cat("Kuzya", 20, 0);
        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < c.length; i++)
            c[i].eat(plate);
        plate.info();
        for (int i = 0; i < c.length; i++) {
            c[i].satietyInfo();
        }
    }
}