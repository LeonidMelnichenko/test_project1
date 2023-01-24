package homework1;
public class Task3 {
    public static void main(String[] args) {
        int array[] = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21};
        int n = array.length - 1;
        for (int i = 0; i < array.length/2; i++){
            int buf = array[i];
            array[i] = array[n];
            array[n] = buf;
            n--;
        }
        System.out.print("массив после инверсии будет иметь следующий вид: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
    }
}
