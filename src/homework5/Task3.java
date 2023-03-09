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
        System.out.println("Enter number");
        while (true) {
            if (in.hasNextInt()) {
                nums.add(in.nextInt());
            } else {
                in.equals("stop");
                in.equals("status");
                Collections.sort(nums);
                System.out.println("sorted array" + nums);
                break;
                }
            }
        in.close();
        }
    }






