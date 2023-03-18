package src.homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stock {
    private int parts = 0;

    public Stock() {
        this.parts = parts;
    }

    public synchronized void get() throws InterruptedException {
        List<Robot> roboParts = new ArrayList<>();
        for(Robot val : roboParts){
            roboParts.add(val);
        }
        Random random = new Random();
        while (parts < 1){
        String parts;
            parts = String.valueOf(roboParts.get(random.nextInt(roboParts.size())));
            try {
            wait();
        } catch (InterruptedException e){}
        }
        parts--;
        notify();
    }
    public synchronized void put() throws InterruptedException {
        while (parts > 1){
            try{
                wait();
            } catch (InterruptedException e){}
        }
        parts++;
        notify();
    }
}
