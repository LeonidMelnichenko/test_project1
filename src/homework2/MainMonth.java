package src.homework2;

public class MainMonth {
    public static void main(String[] args) {
        String name = new String();
        Month month = Month.valueOf(name);

       System.out.println(month.getNameByNumber(4));
       System.out.println(month.getNumberByName("FABRUARY"));
    }
}
