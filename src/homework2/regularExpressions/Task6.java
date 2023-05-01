package src.homework2.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
//    Задача 6:
//    Необходимо найти самое длинное слово в строке.
public class Task6 {
    public static void main(String[] args) {
        String str = "Это предложение, в котором нужно найти самое длинное слово";
        Pattern pattern = Pattern.compile("[А-Яа-я_\\-0-9]*");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            while (matcher.find()) {
                if (matcher.end() - matcher.start() > end - start) {
                    start = matcher.start();
                    end = matcher.end();
                }
            }
            System.out.println(str.substring(start, end));
        }
    }
}
