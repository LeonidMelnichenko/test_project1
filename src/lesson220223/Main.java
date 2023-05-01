package src.lesson220223;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(some(-10));
        } catch (Exception e){
            System.out.println("ERROR");
        } finally {
            System.out.println("End");
        }
    }
        public static int some (int i) throws Exception{
        if (i > 0){
            return i;
        } else {
            throw new Exception();
        }
    }
}
