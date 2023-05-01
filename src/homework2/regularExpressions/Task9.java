package src.homework2.regularExpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//    Задача 9:
//    Реализовать программу которая проверит содержит ли строка некое слово, и если да то
//    напечатает индекс первого символа данного слова.
public class Task9 {
    public static void main(String[] args) {
        String str = "А есть ли слово";
        String word = "Cлово";
        Pattern pattern = Pattern.compile("\\b" + word + "\\b", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.find());
    }
}



