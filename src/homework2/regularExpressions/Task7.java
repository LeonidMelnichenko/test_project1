package src.homework2.regularExpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//    Необходимо узнать есть ли в строке слова которые начинаются
//    и заканчиваются на букву "а".
public class Task7 {
    public static void main(String[] args) {
        String str = "анапа, аа, а АНАНАСИНА, африка";
        Pattern pat = Pattern.compile("\\b[Аа][А-Яа-я]*[Аа]*\\b|\\b[Аа]\\b");
        Matcher mat = pat.matcher(str);
        System.out.println(mat.find());
    }


}
