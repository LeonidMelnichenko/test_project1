package src.homework6;

import java.util.EnumMap;
import java.util.Map;

public class Robot {
    EnumMap<RoboParts, Boolean> terminator = new EnumMap(RoboParts.class);

    public Robot() {
        terminator.put(RoboParts.HEAD, false);
        terminator.put(RoboParts.BODY, false);
        terminator.put(RoboParts.LEFT_HAND, false);
        terminator.put(RoboParts.LEFT_LEG, false);
        terminator.put(RoboParts.RIGHT_HAND, false);
        terminator.put(RoboParts.RIGHT_LEG, false);
    }
}





