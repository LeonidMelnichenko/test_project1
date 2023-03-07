package src.homework5;

import java.io.File;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//        Необходимо реализовать программу, которая будет считывать
//        числа (целые), введенные пользователем, пока пользователь
//        не введет "stop" слово. После чего программа выведет среднее
//        из всех введенных значений.
public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        String s = "stop";
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number:");
        while (true) {
            if (in.hasNextInt()) {
                nums.add(in);
                count++;
            }
            if (in.hasNextLine()) {
                if (in.equals(s)) {
                    for (Integer i : nums) {
                        sum += i;
                        System.out.println(sum / count);
                        break;
                        }
                    } else {
                    in.next();
                }
            }
            in.close();
        }
    }
}


