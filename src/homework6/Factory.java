package src.homework6;

public class Factory implements Runnable {
    Stock stock;

    public Factory(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void run() {
        try {
            stock.put();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
