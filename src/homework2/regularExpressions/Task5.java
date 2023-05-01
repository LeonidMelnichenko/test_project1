package src.homework2.regularExpressions;
//    Задача 5:
//    Необходимо посчитать колличество слов в строке в которых буква
//    "с" встречается 3 и более раз.

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task5 {

        public static void main(String[] args) {
        int count = 0;
        String str = "ccCp сс, сссc";
        Pattern pattern = Pattern.compile("\\b((\\S*[Cp]\\S*){3})\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}
