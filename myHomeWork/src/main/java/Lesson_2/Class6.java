package Lesson_2;

public class Class6 {
    public static void main(String[] args) {
        massivTwo();
    }
    public static void massivTwo() {
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++){
            arr[i]= i+1;}
        System.out.println(arr[99]);
    }
}
