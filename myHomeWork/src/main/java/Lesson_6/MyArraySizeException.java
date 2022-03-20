package Lesson_6;

public class MyArraySizeException extends Exception {
    MyArraySizeException() {
        super("Размер массива должн быть [4 x 4]\n");
    }
}