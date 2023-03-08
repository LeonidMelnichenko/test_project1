package src.homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
//        Необходимо реализовать программу, которая будет считывать
//        числа (целые), введенные пользователем, пока пользователь
//        не введет "stop" слово. После чего программа выведет среднее
//        из всех введенных значений.
public class Task2 {
    public static void main(String[] args) throws IOException {
        int count = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Enter number");
        while (true) {
            if (in.hasNextInt()) {
                nums.add(in.nextInt());
                count++;
            }
            if (!in.hasNextInt()) {
                if (reader.readLine().equals("stop")) {
                    for (int i : nums) {
                        sum += i;
                    }
                    break;
                }
            }
        }
        System.out.println((double) sum / count);
    }
}









