package src.homework2;

public enum Month {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12),
    ;
    private static int number;
    Month(int number) {
        number = number;
    }
    public static int getNumberByName(String name) {
        for (Month month : Month.values()) {
            if (month.name() == name) {
                return number;
            }
        }
        return 0;
    }
     static String getNameByNumber(int number) {
        for (Month month : Month.values()) {
            if (month.number == number) {
                return name;
            }
        }
        return null;
    }
}

