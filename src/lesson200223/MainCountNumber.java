package src.lesson200223;

import java.util.HashMap;
import java.util.Map;

public class MainCountNumber {

    public static void main(String[] args) {
        System.out.println(getCharsCount(new int []{1, 2, 3, 4, 3, 3}));
    }
    public static Map<Integer, Integer> getCharsCount (int [] numbers){
        Map<Integer, Integer> result = new HashMap<>();
        for ( int i : numbers){
            Integer current  = result.get(i);
                if(current == null){
                    result.put(i, 1);
                } else
                result.put(i, ++current);
            }
        return result;
    }
}
