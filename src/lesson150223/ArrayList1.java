package src.lesson150223;
import src.homework2.task2.Box;

import java.util.ArrayList;
import java.util.List;
public class ArrayList1 {
    public static void main(String[] args) {
        List<Box123>boxes = new ArrayList<>();
        boxes.add(new Box123(1, 2, 3));
        boxes.add(new  Box123(2, 4, 6));
        System.out.println(boxes);

        Box123 biggest = boxes.get(0);
        for (Box123 box123 : boxes){
            if(biggest.volume() > box123.volume()){
                biggest = box123;
            }
        }
        boxes.remove(biggest);
        System.out.println(boxes);
    }
}
