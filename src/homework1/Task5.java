package homework1;
public class Task5 {
    public static void main(String[] args) {
        int matrix[][] = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10 + 1);
                System.out.print(" | " + matrix[i][j]);
            }
        }
        System.out.println();
        boolean b1 = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                if (i == j) {           //проверяем является ли вообще матрица квадратной
                    if (matrix[i][j] != 0) {
                        b1 = true;
                    }
                }
                     else    {
                         break;
                }
            }
        }
        if (b1 = true) {
            System.out.println("матрица является нижней треугольной");
                } else {
                        System.out.println("матрица не является нижней треугольной");
        }
    }
}



