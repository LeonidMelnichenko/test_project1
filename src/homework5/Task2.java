package src.homework5;

import java.util.Scanner;
//        Необходимо реализовать программу, которая будет считывать
//        числа (целые), введенные пользователем, пока пользователь
//        не введет "stop" слово. После чего программа выведет среднее
//        из всех введенных значений.
public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        String a;
            Scanner in = new Scanner(System.in);
                System.out.println("Enter number");
        while (true) {
            if (in.hasNextInt()) {
                sum += in.nextInt();
                    count++;
                }
            if (in.hasNextLine()){
                if (in.nextLine().equals("stop") && sum > 0) {
                    System.out.println((double) sum / count);
                        break;
                    }
                }
            }
        }
    }




























