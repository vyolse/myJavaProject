package Lesson_2;

public class Class8 {
    public static void main(String[] args) {
        kvadrat();
        diag(); // без циклов
    }

    public static void kvadrat() {
        int[][] kvad = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                kvad[i][i] = 1;
                kvad[i][5 - i - 1] = 1;

                System.out.print(kvad[i][j] + " ");

            }
            System.out.println();
        }System.out.println();
    }
    public static void diag() {
        int[][] A = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    A[i][j] = 1;
                }
                else if (i == 3 - j) {
                    A[i][j] = 1;
                }
                else {
                    A[i][j] = 0;
                }
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}

