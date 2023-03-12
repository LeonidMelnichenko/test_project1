package src.homework5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//        Необходимо реализовать программу, которая будет считывать
//        числа, введенные пользователем, пока пользователь не введет
//        "stop" слово. по команде "status" необходимо вывести введенные
//        цифры в отсортированном виде (от меньшего к большему).
public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        String a;
        System.out.println("You entered integer :");
        while (true) {
            if (in.hasNextInt()) {
                nums.add(in.nextInt());
                System.out.println("You entered integer :");
            } else {
                a = in.nextLine();
                if (a.equals("status")) {
                    Collections.sort(nums);
                    System.out.println("sorted array" + nums);
                } else if (a.equals("stop")) {
                    break;
                }
            }
        }
    }
}









