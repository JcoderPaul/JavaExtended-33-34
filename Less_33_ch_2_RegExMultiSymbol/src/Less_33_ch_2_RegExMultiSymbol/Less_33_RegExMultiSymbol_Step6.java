package Less_33_ch_2_RegExMultiSymbol;
/*
Примеры работы с:
Пример 1 -> \s - пробельный символ или табуляция, перевод
                 строки, конец страницы [ \t\n\x0B\f\r]
Пример 2 -> X{n,m} - X, не менее n, но не более m раз
Пример 3 и 4 -> X{n,} - X, не менее n раз
Пример 4 и 5 -> (XYZ) - XYZ, как захватывающая группа
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Less_33_RegExMultiSymbol_Step6 {
    public static void main(String[] args) {
        System.out.println("----------------- Пример 1. -----------------");
        // Строка для поиска один
        String my_str = "a9wef     ert        235gdyj  478k cw5yb     ";
        // Ищем серии пробелов
        Pattern my_pattern = Pattern.compile("\\w\\s+\\w");
        Matcher my_matcher = my_pattern.matcher(my_str);

        while (my_matcher.find()) {
            System.out.println("Позиция вхождения '" + my_matcher.start() +
                               "' вхождение -> " + my_matcher.group());

        }
        System.out.println("----------------- Пример 2. -----------------");
        // Строка для поиска два
        String my_str_2 = "a5wsfh678kf rt 2vdr35gdyj478kcw5ybASSTTY%(&#fhkyortht";
        // Ищем набор символов НЕ цифр идущих подряд количеством от 2 до 6
        Pattern my_pattern_2 = Pattern.compile("\\D{2,6}");
        Matcher my_matcher_2 = my_pattern_2.matcher(my_str_2);

        while (my_matcher_2.find()) {
            System.out.println("Позиция вхождения '" + my_matcher_2.start() +
                               "' вхождение -> " + my_matcher_2.group());

        }
        System.out.println("----------------- Пример 3. -----------------");
        // Строка для поиска три
        String my_str_3 = "a4wsfh678kf rt 2vdr35gdyj478kcw5ybASSTTY%(&#fhkyortht";
        // Ищем набор символов НЕ цифр идущих подряд количеством от 2 до максимального количества
        Pattern my_pattern_3 = Pattern.compile("\\D{2,}");
        Matcher my_matcher_3 = my_pattern_3.matcher(my_str_3);

        while (my_matcher_3.find()) {
            System.out.println("Позиция вхождения '" + my_matcher_3.start() +
                               "' вхождение -> " + my_matcher_3.group());

        }
        System.out.println("----------------- Пример 4. -----------------");
        // Строка для поиска четыре
        String my_str_4 = "a4wsfh678wskwskfrtwskwskwsk2vdr35gdyj4wskwsk7w5ybASSwkkyortht";
        /*
        Ищем набор символов 'wsk' повторяющийся от 2 до максимума раз.
        Применить вариант 'wsk{2,}' нельзя т.к. фигурные скобки будут
        применены только к символу 'k', а 'ws' будут проигнорированы.
        */
        Pattern my_pattern_4 = Pattern.compile("(wsk){2,}");
        Matcher my_matcher_4 = my_pattern_4.matcher(my_str_4);

        while (my_matcher_4.find()) {
            System.out.println("Позиция вхождения '" + my_matcher_4.start() +
                    "' вхождение -> " + my_matcher_4.group());

        }
        System.out.println("----------------- Пример 5. -----------------");
        // Строка для поиска пять
        String my_str_5 = "a4wskfh678wskwskfrtFwskwskwsk2vdr35gdyj4wskFwsk7w5ybASSwkkyortht";
        /*
        Ищем набор символов 'F(wsk)' при этом 'wsk'
        может повторяться от 2 до максимума раз.
        */
        Pattern my_pattern_5 = Pattern.compile("F(wsk){2,}");
        Matcher my_matcher_5 = my_pattern_5.matcher(my_str_5);

        while (my_matcher_5.find()) {
            System.out.println("Позиция вхождения '" + my_matcher_5.start() +
                    "' вхождение -> " + my_matcher_5.group());

        }
    }
}
