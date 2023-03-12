package src.homework5;
//Необходимо реализовать программу "калькулятор".
//Поддерживаемые операции +-/* выбор операции и ввод данных
//осуществляется пользователем с клавиатуры.
import java.util.Scanner;
public class Calculator {
        static Scanner in = new Scanner(System.in);
        public static int getInt(){
            System.out.println("Enter your number: ");
            int number;
            if(in.hasNextInt()){
                number = in.nextInt();
            } else {
                System.out.println("Error. Try again.");
                in.next();
                number = getInt();
            }
            return number;
        }
        public static char getOperation(){
            System.out.println("Choice operaition:");
            char operation;
            if(in.hasNext()){
                operation = in.next().charAt(0);
            } else {
                System.out.println("Error. Try again.");
                in.next();
                operation = getOperation();
            }
            return operation;
        }
        public static int calculator(int numberOne, int numberTwo, char operation){
            int result;
            switch (operation){
                case '+': result = numberOne + numberTwo;
                    break;
                case '-': result = numberOne - numberTwo;
                    break;
                case '/': result = numberOne / numberTwo;
                    break;
                case '*': result = numberOne * numberTwo;
                    break;
                default:
                result = calculator(numberOne, numberTwo, getOperation());
            }
            return result;
        }
    }


