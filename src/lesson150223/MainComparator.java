package src.lesson150223;

import src.lessons130223.BoxComparator;

import java.util.Set;
import java.util.TreeSet;

public class MainComparator {
    public static void main(String[] args) {
        BoxNew one = new BoxNew(1, 2, 4);
        BoxNew two = new BoxNew(1, 6, 40);
        BoxNew three = new BoxNew(1, 78, 7);

        BoxComparator comparator = new BoxComparator();
        Set<BoxNew> boxes = new TreeSet<>(comparator);
        boxes.add(one);
        boxes.add(two);
        boxes.add(three);
        System.out.println(boxes);
    }
}
