package src.lesson150223;

import java.util.Random;

public class MainNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(10);
        int y = random.nextInt(10);
        int z = random.nextInt(10);
        if(x>z){
            System.out.println(x+z);
        } else {
            System.out.println(z);
        }
        System.out.println((double) (x+z+y)/3);
    }




}
