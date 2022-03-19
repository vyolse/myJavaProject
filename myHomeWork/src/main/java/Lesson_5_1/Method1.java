package Lesson_5_1;

public class Method1 {

    public static void main(String[] args) {
        int i, a;
        int num[] = new int[3];
        num[0] = 10;
        num[1] = 5;
        num[2] = 2;
        System.out.println("Исходный");
        for (i = 0; i < num.length; i++)
            System.out.println( "Ячейка ["+ i + "] " + num[i]);
        System.out.println("Измененный ");
        a = num[0];
        num[0] = num[1];
        num[1] = a;
        for (i = 0; i < num.length; i++)
            System.out.println( "Ячейка ["+ i + "] " + num[i]);


    }
}
