package Lesson_8;

public class Main {


    public static void main(String[] args){

        Phonebook phonebook = new Phonebook();

        System.out.println("Наполняем справочник");
        phonebook.add("Сидоренко", "+375291111111");
        phonebook.add("Сидоренко", "+375292222222");
        phonebook.add("Петухов", "+375293333333");
        phonebook.add("Даниленко", "+375294444444");
        phonebook.add("Сидоренко", "+375295555555");
        System.out.println();

        System.out.println("В результате:");
        System.out.println("Сидоренко");
        System.out.println(phonebook.get("Сидоренко"));
        System.out.println("Петухов");
        System.out.println(phonebook.get("Петухов"));
        System.out.println("Даниленко");
        System.out.println(phonebook.get("Даниленко"));
        System.out.println();

        System.out.println("Случай отсутствия записи:");
        System.out.println("Соловьев");
        System.out.println(phonebook.get("Соловьев"));
        System.out.println();

        System.out.println("Попытка записать уже существующий номер");
        phonebook.add("Сидоренко", "+375291111111");
        System.out.println("Сидоренко");
        System.out.println(phonebook.get("Сидоренко"));
    }




}