package Lesson_6;

public class MyArrayDataException extends Exception {
    MyArrayDataException(int str, int stl) {
        super(String.format("Неверные данные находятся в ячейке [%d, %d]\n", str, stl));
    }
}