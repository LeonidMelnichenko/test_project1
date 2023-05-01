package src.lessons130223;

public class ArrayHolder <T>{

    private T[] array;
    public ArrayHolder(T[] array1) {
        this.array = array1;
    }
    public T getByIndex(int index) {
        return array[index];
    }
    public static void main(String[] args) {
        Integer[] array = new Integer[]{
              1, 2, 3
        };
       ArrayHolder<Integer> integerArrayHolderarrayHolder = new ArrayHolder<>(array);
       Integer element = integerArrayHolderarrayHolder.getByIndex(2);
        System.out.println(element);
    }
}
