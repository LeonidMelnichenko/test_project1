package src.homework6;

public class Country implements Runnable {


    @Override
    public void run() {
        System.out.println("Страна " + Thread.currentThread().getName() + " берет детали");
        Stock.getParts();
    }
}
