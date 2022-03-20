package Lesson_6;

public class Main {
    public static void main(String[] args) throws MyArraySizeException,MyArrayDataException{

        String[][] Arr = {{"3", "7", "2", "9"},{"1", "6", "0", "4"}, {"0", "5", "7", "2"}, {"0", "2", "7", "8"}};

        try {
            System.out.println("Сумма всех элементов массива равна " + Method.strMethod(Arr) + ".\n");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}