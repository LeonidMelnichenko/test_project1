package homework1;
public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[]{23, 45, 76, 12, -9, 38};
        int numberN = 76;
        int sum = 0;

        for(int i = 0; i < array.length; ++i) {
            if (array[i] != numberN) {
                sum += array[i];
            }
        }
        System.out.println("сумма всех элементов массива равна: " + sum);
    }
}
