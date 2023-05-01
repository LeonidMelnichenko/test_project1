package src.homework6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Factory factory = new Factory();
        Robot robot = new Robot();
        Country country1 = new Country();
        Country country2 = new Country();

        factory.start();
        country1.start();
        country2.start();




    }
}
