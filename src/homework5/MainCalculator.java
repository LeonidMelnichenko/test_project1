package src.homework5;
import java.util.Scanner;
public class MainCalculator {
    public static void main(String[] args) {
        int numberOne = Calculator.getInt();
        char operation = Calculator.getOperation();
        int numberTwo = Calculator.getInt();
        int result = Calculator.calculator(numberOne,numberTwo,operation);
        System.out.println("result: " + result);
    }
}




