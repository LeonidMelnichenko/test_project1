package src.homework2.regularExpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//    Задача 8:
//    Необходимо извлечь из строки и распечатать номер карты
//        (XXXX-XXXX-XXXX-XXXX) если он там есть.
public class Task8 {
    public static void main(String[] args) {
        String str = "Ваша карта N (2589-7859-7458-8521) активна";
        Pattern pattern = Pattern.compile("\\b(\\d{4}-){3}\\d{4}\\b");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
