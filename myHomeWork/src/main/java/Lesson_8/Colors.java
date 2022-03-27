package Lesson_8;

import java.util.*;

public class Colors {

    public static void main(String[] args) {

        List<String> words = Arrays.asList(
                "Красный", "Оранжевый", "Зеленый", "Голубой", "Синий",
                "Фиолетовый", "Красный", "Синий", "Зеленый", "Голубой",
                "Красный", "Оранжевый", "Красный", "Зеленый", "Зеленый",
                "Фиолетовый", "Красный", "Синий", "Красный", "Голубой");

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println();
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println();
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
