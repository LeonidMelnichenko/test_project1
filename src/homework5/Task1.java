package src.homework5;
//Необходимо реализовать программу, которая будет бесконечно
// считывать строки введенные пользователем и выводить их в консоль.
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter words:");
        while (true){
            System.out.println(in.nextLine());
        }
    }
}
