package homework1;
public class Task2 {
    public static void main(String[] args) {
        int sum = 0;
        int[] array = new int[20];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 7; i++){
            if(array[i] % 2 == 0){
                sum += array[i];
            }
        }
        System.out.println("сумма " + sum);
    }
}