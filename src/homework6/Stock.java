package src.homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stock {
    private String parts = null;
    private Integer partsCounter = 0;

    public Stock() {
        this.parts = parts;
    }

    public synchronized void get() throws InterruptedException {
        List<Robot> roboParts = new ArrayList<>();
        for(Robot val : roboParts){
            roboParts.add(val);
        }
        Random random = new Random();
        while (partsCounter < 1){
            parts = String.valueOf(roboParts.get(random.nextInt(roboParts.size())));
            partsCounter++;
            try {
            wait();
        } catch (InterruptedException e){}
        }
        partsCounter--;
        notify();
    }
    public synchronized void put() throws InterruptedException {
        while (partsCounter > 1){
            try{
                wait();
            } catch (InterruptedException e){}
        }
        partsCounter++;
        notify();
    }
}
