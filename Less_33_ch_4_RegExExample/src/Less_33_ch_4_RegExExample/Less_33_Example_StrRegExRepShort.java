package Less_33_ch_4_RegExExample;
/*
Пример работы методов:
- *.group();
- *.appendReplacement();
- *.appendTail();

Очень похож на Less_33_Example_StrRegExReplacement, но короче.
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Less_33_Example_StrRegExRepShort {

    public static void main(String[] args) {
        String original_string = "aabtextaabtextabtextb the end";
        System.out.println(original_string);
        System.out.println("----------------------------------------------------------");
        Pattern pattern = Pattern.compile("a*b");
        Matcher matcher = pattern.matcher(original_string);
        StringBuffer buffer = new StringBuffer();
        int count = 1;
        while (matcher.find()) {
            System.out.print("Проход " + count++ + " -> ");
            System.out.print(matcher.appendReplacement(buffer, "-").group());
            // buffer = "-" -> "-text-" -> "-text-text-" -> "-text-text-text-"
            System.out.println(" -> " + buffer);
        }
        System.out.println("----------------------------------------------------------");
        System.out.println(matcher.appendTail(buffer));
        // buffer = "-text-text-text- the end"
    }
}
