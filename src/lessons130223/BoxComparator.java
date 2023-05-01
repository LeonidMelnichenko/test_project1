package src.lessons130223;

import src.lesson150223.BoxNew;

import java.util.Comparator;

public class BoxComparator implements Comparator<BoxNew> {
    @Override
    public int compare(BoxNew o1, BoxNew o2) {
        return Integer.compare(o1.volume(), o1.volume());
    }
}
