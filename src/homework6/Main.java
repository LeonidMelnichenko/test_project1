package src.homework6;

public class Main {
    public static void main(String[] args) {
        Stock  stock = new Stock();
        Factory factory = new Factory(stock);
        StateOne stateOne = new StateOne(stock);
        StateTwo stateTwo = new StateTwo(stock);
        new Thread(factory).start();
        new Thread(stateOne).start();
        new Thread(stateTwo).start();
    }
}
