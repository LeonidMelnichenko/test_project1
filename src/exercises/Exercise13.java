package src.exercises;

public class Exercise13 {
    public static void main(String[] args) {
            factorial(10);
        }
        public static int factorial (int num){
            int i = 1;
            int fact = 1;
            while (i < num){
                fact *=i;
                i++;
            }
            System.out.println(fact);
            return 0;
        }
    }
