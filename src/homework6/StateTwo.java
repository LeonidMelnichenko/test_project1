package src.homework6;

public class StateTwo implements Runnable {
    Stock stock;

    public StateTwo(Stock stock) {
        this.stock = stock;
    }


    @Override
    public void run() {
            try {
                stock.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
