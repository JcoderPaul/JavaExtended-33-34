package Less_33_ch_2_RegExMultiSymbol;
/*
Примеры работы с:
Пример 1 -> \X? - Х, один раз или ни разу;
Пример 2 -> \X* - X, ноль или более раз;
Пример 3 -> \A - определенное начало последовательности (входящих данных)
Пример 4 -> \Z - определенный конец вводящей последовательности, если он есть
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Less_33_RegExMultiSymbol_Step7 {
    public static void main(String[] args) {
        System.out.println("----------------- Пример 1. -----------------");
        // Строка для поиска один
        String my_str_1 = "a4wskfh678wskwskfrtFwskwskwsk2vdr35gdyj4wskFwsk7w5ybASSwkkyorFtht";
        /*
        Ищем символ 'F' после которого может идти
        последовательность '(wsk)', а может и не идти.
        */
        Pattern my_pattern_1 = Pattern.compile("F(wsk)?");
        Matcher my_matcher_1 = my_pattern_1.matcher(my_str_1);

        while (my_matcher_1.find()) {
            System.out.println("Позиция вхождения '" + my_matcher_1.start() +
                    "' вхождение -> " + my_matcher_1.group());

        }
        System.out.println("----------------- Пример 2. -----------------");
        // Строка для поиска два
        String my_str_2 = "a4wskfh678wskwskfrtFwskwskwsk2vdr35gdyj4wskFwsk7w5ybASSwkkyorFtht";
        /*
        Ищем символ 'F' после которого может идти
        последовательность '(wsk)' ноль или более раз.
        */
        Pattern my_pattern_2 = Pattern.compile("F(wsk)*");
        Matcher my_matcher_2 = my_pattern_2.matcher(my_str_2);

        while (my_matcher_2.find()) {
            System.out.println("Позиция вхождения '" + my_matcher_2.start() +
                               "' вхождение -> " + my_matcher_2.group());

        }
        System.out.println("----------------- Пример 3. -----------------");
        // Строка для поиска три
        String my_str_3 = "a4wsfh678kf a4 2vdr35gdyj478a4 w5ybASSTTY%(&#fhkyortht";
        /*
        Находится ли символ(символы), например 'a4' в начале входящей
        последовательности (строки), и только в начале нас и будет
        интересовать.
        */
        Pattern my_pattern_3 = Pattern.compile("\\Aa4");
        Matcher my_matcher_3 = my_pattern_3.matcher(my_str_3);

        while (my_matcher_3.find()) {
            System.out.println("Позиция вхождения '" + my_matcher_3.start() +
                               "' вхождение -> " + my_matcher_3.group());

        }
        System.out.println("----------------- Пример 4. -----------------");
        // Строка для поиска четыре
        String my_str_4 = "a4wHTsfh678wsHTskfrtwsk HT wskwsk2vdr35gdyj4wskwsk7w5ybASSwkkyortHT";
        /*
        Находится ли символ (последовательность символов) в конце строки,
        например '(HT)' есть ли в конце строки, и только в конце.
        */
        Pattern my_pattern_4 = Pattern.compile("(HT)\\Z");
        Matcher my_matcher_4 = my_pattern_4.matcher(my_str_4);

        while (my_matcher_4.find()) {
            System.out.println("Позиция вхождения '" + my_matcher_4.start() +
                    "' вхождение -> " + my_matcher_4.group());

        }
    }
 }
