package src.homework2.task2;

import src.homework2.task2.Box;

public class MainBox {
    public static void main(String[] args) {
        Box box1 = new Box (5, 5, 5);
        Box box2 = new Box (6);
        Box box3 = new Box (7, 5, 5);
        Box box4 = new Box (3,4);

        box1.getBoxType();
        box2.getBoxType();
        box3.getBoxType();
        box4.getBoxType();
    }
}
