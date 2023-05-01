package src.lesson200223;

import java.util.HashMap;
import java.util.Map;

public class MainCount {

    public static void main(String[] args) {
        System.out.println(getCharsCount("hello"));

    }
    public static Map<Character, Integer> getCharsCount (String s){
        Map<Character, Integer> result = new HashMap<>();
        char[] arrayOfChars = s.toCharArray();
        for ( char i : arrayOfChars){
            if(result.containsKey(i)){
                int count = result.get(i);
                result.put(i, ++count);
            }   else {
                result.put(i, 1);
            }
        }
        return result;
    }
}
