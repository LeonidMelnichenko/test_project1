package src.lessons130223;

import src.lesson150223.Box123;

import java.util.*;

public class MainEquals {
    public static void main(String[] args) {
        Box123 one = new Box123(1, 2, 4);
        Box123 two = new Box123(1, 6, 40);
        Box123 three = new Box123(1, 78, 7);

        Set<Box123> boxes = new TreeSet<>();
        boxes.add(one);
        boxes.add(two);
        boxes.add(three);
        System.out.println(boxes);

    }
}
