package src.homework6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Factory factory = new Factory();
        Robot robot = new Robot();
        Stock stock = new Stock();
        Country country1 = new Country();
        Country country2 = new Country();



        new Thread(factory).start();
        new Thread(country1).start();
        new Thread(country2).start();




    }
}
