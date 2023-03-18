package src.homework6;

public class StateOne implements Runnable {
    Stock stock;

    public StateOne(Stock stock) {
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
