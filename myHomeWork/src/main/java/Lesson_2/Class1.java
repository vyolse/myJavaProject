package Lesson_2;

public class Class1 {
    public static void main(String[] args) {
        suma(15, 4);
    }

    public static boolean suma(int a, int b) {
        int summ = a + b;
        if (summ >= 10 && summ <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
