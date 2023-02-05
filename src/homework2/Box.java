package src.homework2;
public class Box {
    private int length;
    private int wigth;
    private int higth;

    public Box (int cube){
        this.wigth = cube;
        this.length = cube;
        this.higth = cube;
    }
    public Box(int length, int wigth, int higth){
        this.length = length;
        this.wigth = wigth;
        this.higth = higth;
    }
    public Box(int length, int wigth){
        this.length = length;
        this.wigth = wigth;
        this.higth = 0;
    }
    public void getBoxType(){
        if(length == wigth && length == higth && wigth == higth){
            System.out.println("Куб");
        } else if (length > higth && higth != 0) {
            System.out.println("Обычная коробка");
        } else if (higth == 0)
            System.out.println("Конверт");
    }
}
