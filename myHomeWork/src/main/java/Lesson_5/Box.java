package Lesson_5;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> packOfFruits;

    public Box() {
        this.packOfFruits = new ArrayList<>();
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T o : packOfFruits) {
            weight += o.getWeight();
        }
        return weight;
    }

    public void pour(Box<T> anotherBox) {
        anotherBox.packOfFruits.addAll(packOfFruits);
        packOfFruits.clear();
    }

    public void addFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            packOfFruits.add(fruit);
        }
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }
}
