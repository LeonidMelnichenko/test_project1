package src.homework1;

public class Task6 {
    public static int n = 4;
    public static void main(String[] args) {
        int matrix1[][] = new int[n][n];
        int matrix2[][] = new int[n][n];
        int matrixPlus[][] = new int[n][n];
        int matrixMinus[][] = new int[n][n];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = (int) (Math.random() * 10 + 1);
                System.out.print(" | " + matrix1[i][j]);
            }
        }
        System.out.println();
            for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = (int) (Math.random() * 10 + 1);
                System.out.print(" | " + matrix2[i][j]);
            }
        }
        System.out.println();
        for (int i = 0; i < matrixPlus.length; i++) {
            for (int j = 0; j < matrixPlus[i].length; j++) {
            matrixPlus[i][j] = matrix1[i][j] + matrix2[i][j];
            System.out.print(" | " + matrixPlus[i][j]);
            }
        }
        System.out.println();
        for (int i = 0; i < matrixMinus.length; i++) {
            for (int j = 0; j < matrixMinus[i].length; j++) {
            matrixMinus[i][j] = matrix1[i][j] + (- 1) * matrix2[i][j];
            System.out.print(" | " + matrixMinus[i][j]);
            }
        }
    }
}
