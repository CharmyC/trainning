package basic.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhuanli.cheng on 2017/12/11.
 */
public class RegextText {
    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("+1234".matches("[-\\+]?\\d+"));

        Pattern pattern = Pattern.compile("[-|\\+](\\d+)");
        Matcher match = pattern.matcher("+1234");
        System.out.println(match.matches());
        System.out.println(match.groupCount());
        while (match.find()) {
            System.out.println(match.find() + "," + match.group() + "," +
                    match.start() + "," + (match.end() - 1));
        }

    }
}
