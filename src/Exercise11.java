public class Exercise11 {
    public static void main(String[] args) {
        int a = 34;
        int b = 14;
        int c = 17;
        int d = 20;
        int f = 25;
        int e = 23;
        if (f > d && e > c) {
            if (e > d && f > c) {
                System.out.println("Дом 1 влазит");
            }
        } else {
            System.out.println("Дом 1 не влазит");
        }
            if (f > b && e > a) {
            if (e > b && f > a) {
                System.out.println("Дом 2 влазит");
            }
        } else {
            System.out.println("Дом 2 не влазит");
        }
    }
}
