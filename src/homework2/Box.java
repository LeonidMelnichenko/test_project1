package src.homework2;
public class Box {
    private int length;
    private int wigth;
    private int higth;

    public Box (int cube){
        wigth = length = higth = 0;
    }
    public Box(int length, int wigth, int higth){
        this.length = 0;
        this.wigth = 0;
        this.higth = 0;
    }

    public Box(int length, int wigth){
        this.length = 0;
        this.wigth = 0;
    }
    public void getTipeBox(int length, int wigth, int higth){
        if(length == wigth && length==higth && wigth==higth){
            System.out.println("Куб");
        } else if (length > higth && higth != 0) {
            System.out.println("Обычная коробка");
        } else if (higth == 0)
            System.out.println("Конверт");
            }
        }
