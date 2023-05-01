package src.lesson150223;

import java.util.LinkedList;

public class MainLinked {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.addFirst(1);
        System.out.println(numbers);
        numbers.addFirst(2);
        System.out.println(numbers);
        numbers.addFirst(3);
        System.out.println(numbers);

        numbers.removeFirst();
        System.out.println(numbers);
        numbers.removeFirst();
        System.out.println(numbers);
        numbers.removeFirst();
        System.out.println(numbers);
    }
}
