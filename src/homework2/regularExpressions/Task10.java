package src.homework2.regularExpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//    Задача 10:
//    Используя класс Box из задания 2, необходимо
//    добавить в него конструктор который принимает строку вида:
//    Box[1,2,3] или Box[2] или Box[1,2]
//    И как результат создает соответствующий обьект.
public class Task10 {

    public static class Box {
        private static final String BOX_REGEXP = "Box\\[(\\d)(,(\\d)(,(\\d))?)?]";
        private static final Pattern PATTERN = Pattern.compile(BOX_REGEXP);

        private int x, y, z;
        public Box(String str) {
            Matcher matcher = PATTERN.matcher(str);
            if (matcher.find()) {
                this.x = Integer.parseInt(matcher.group(1));
                if (matcher.group(3) != null) {
                    this.y = Integer.parseInt(matcher.group(3));
                    if (matcher.group(5) != null) {
                        this.z = Integer.parseInt(matcher.group(5));
                    }
                }
            }
        }
    }
}
