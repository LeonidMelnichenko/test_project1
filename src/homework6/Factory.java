package src.homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Factory implements Runnable {
    public static final Random RANDOM = new Random();
    public static final List<RoboParts> allParts = new ArrayList<>();

    public static void generateRoboParts() {

        RoboParts[] roboparts = RoboParts.values();
        while (true) {
            try {
                Thread.sleep(5000);
                allParts.add(roboparts[RANDOM.nextInt(roboparts.length)]);
                System.out.println(allParts);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Factory is produce next parts of robots");
        Factory.generateRoboParts();
    }
}







