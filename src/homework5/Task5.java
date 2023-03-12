package src.homework5;
//        Необходимо написать программу считающую сумму и разность двух
//        квадратных матриц. Пользователь вводит матрицы с клавиатуры.

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter n");
        int n = Math.abs(getIntValue(in));

        System.out.println("Enter m");
        int m = Math.abs(getIntValue(in));

        int[][] array1 = createArray(n, m);
        int[][] array2 = createArray(n, m);

        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array1[i][j] = getIntValue(in);
            }
        }

        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array2[i][j] = getIntValue(in);
            }
        }
        System.out.println("First array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of matrice: ");
        int[][] sum = createArray(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] = array1[i][j] + array2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix difference: ");
        int[][] diff = createArray(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                diff[i][j] = array1[i][j] + (array2[i][j] * (-1));
                System.out.print(diff[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static int[][] createArray(int n, int m) {
        int[][] array;
        try {
            array  = new int[n][m];
        } catch (NegativeArraySizeException e) {
            System.out.println("You have entered negative value for array size");
            array = new int[Math.abs(n)][Math.abs(m)];
        }
        return array;
    }
    private static int getIntValue(Scanner in) {
        int n;
        System.out.println("Enter int value ");
        while (true){
            if(in.hasNextInt()){
                n = in.nextInt();
                break;
            } else {
                System.out.println("Try again");
                in.next();
            }
        }
        return n;
    }
}

