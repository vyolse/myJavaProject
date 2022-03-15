package Lesson_4_1;

public class Animal {
    private String name;
    private int run;
    private int swim;

    Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }
    void running() {
        System.out.println(name + " пробежал " + run + " метров");
    }
    void swimming() {
        System.out.println(name + " проплыл " + swim + " метров");
    }

    String getName() {
        return name;
    }
    int getRun() {
        return run;
    }
    int getSwim() {
        return swim;
    }
}

class Cat extends Animal {
    Cat(String name, int run, int swim) {
        super(name, run, swim);
    }

    public static void main(String args[]) {
        Cat Бар = new Cat("Кот Барсик", 100, 10);
        if (Бар.getRun() > 200) System.out.println(Бар.getName() + " столько не пробежит");
        else Бар.running();
        if (Бар.getSwim() > 0) System.out.println(Бар.getName() + " не умеет плавать");
        else Бар.swimming();
    }
}

class Dog extends Animal {
    Dog(String name, int run, int swim) {
        super(name, run, swim);
    }

    public static void main(String args[]) {
        Dog pup = new Dog("Пес Бобик", 200, 11);
        if (pup.getRun() > 500) System.out.println(pup.getName() + " столько не пробежит");
        else pup.running();
        if (pup.getSwim() > 10) System.out.println(pup.getName() + " проплыл 10 метров и попытался утонуть, " +
                "но его спасли");
        else pup.swimming();
    }
}