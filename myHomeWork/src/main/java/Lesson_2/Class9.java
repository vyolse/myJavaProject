package Lesson_2;

public class Class9 {
    public static void main(String[] args) {
        pub(5, 10);
    }
    public static void pub(int len, int initialValue){
        int[] arr = new int[len];
        for(int i=0;i < len;i++){
            if(arr[i]<initialValue){arr[i]+=initialValue;}
            System.out.println(arr[0]);
        }
    }
}
