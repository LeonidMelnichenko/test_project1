package homework1;
public class Task2 {
    public static void main(String[] args) {
        int array[] = {0, 1, 1, 2, 3, 5, 8, 13, 21};
        int sumChet = 0;
        for(int i = 0; i < array[6]; i++){
            if(array[i] % 2 == 0){
                sumChet+=array[i];
            }
        }
        System.out.println("Сумма всех четных чисел до 7 индекса равна: " + sumChet);
    }
}
