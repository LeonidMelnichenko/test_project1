package homework1;
public class Task4 {
    public static void main(String[] args) {
        int [][] matrix = new int [][]{{1, 5, 6}, {4, -4, 2}, {5, 8, -4}
        };
        int minus = 0;
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] < 0) minus++;
               }
            }
            System.out.println("количество отрицательных элементов равно: " + minus);
        int plus = 0;
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] > 0) plus++;
            }
        }
            System.out.println("количество положительных элементов равно: " + plus);
        if (plus > minus){
            System.out.println("положительных элементов больше");
        } else {
            System.out.println("отрицательных элементов больше");
        }
    }
}
