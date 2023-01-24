package src.lesson4;

public class ArrayMulti {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2},
                {3, 4, 5}
        };
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }

            }
        }
        System.out.println("max " + max);
    }
}
