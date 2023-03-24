package src.homework6;

public class Robot {
    public static RoboParts[] terminator = new RoboParts[]{
                                            RoboParts.BODY,
                                            RoboParts.HEAD,
                                            RoboParts.LEFT_HAND,
                                            RoboParts.RIGHT_HAND,
                                            RoboParts.LEFT_LEG,
                                            RoboParts.RIGHT_LEG};


    public RoboParts[] getTerminator() {
        return terminator;
    }
}


