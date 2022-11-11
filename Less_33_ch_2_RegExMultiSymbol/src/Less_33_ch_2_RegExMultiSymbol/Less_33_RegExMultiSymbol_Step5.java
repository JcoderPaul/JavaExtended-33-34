package Less_33_ch_2_RegExMultiSymbol;
/*
1. Найдем только телефоны, это + и девять цифр, т.е. '+[0-9]{9}'
2. Найти все емайлы, а это последовательность \w+@\w+.(ru|com)
   для примера ограничимся только зонами RU и COM
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Less_33_RegExMultiSymbol_Step5 {
    public static void main(String[] args) {
        // Строка где будет вестись поиск
        String my_str =
                "Куралесов Василий, Россия, Москва, пр-т. Вернадского, дом. 34, кв. 69, " +
                "email: vasyakuralesov@yandex.ru, Почтовый индекс: 458962, тел.: +759845689; " +
                "Хайд Стивен, США, Нью-Йорк, ул. Мэддисон, дом. 278, кв. 169, " +
                "email: jekilandhide@gmail.com, Почтовый индекс: DA-2345, тел.: +755564895; "+
                "Линд Дуглас, Австралия, Брисбен, ул. Гарден Роуд, дом. 14, кв. 5, " +
                "email: boogieboy@yahoo.com, Почтовый индекс: Au-34545, тел.: +734264892; ";
        /*
        1. Задали регулярное выражение которое работает с набором
        '\\+[0-9]{9}' знак '+' экранируем.
        */
        Pattern my_pattern = Pattern.compile("\\+[0-9]{9}");
        Matcher my_matcher = my_pattern.matcher(my_str);
        /*
        2. Задали регулярное выражение которое работает с набором:
        '\w+@\w+.(ru|com)'
        Так упрощенно мы фиксируем адреса электронной почты.
        */
        Pattern my_pattern_2 = Pattern.compile("\\w+@\\w+.(ru|com)");
        Matcher my_matcher_2 = my_pattern_2.matcher(my_str);

        while (my_matcher.find()) {
            System.out.println(my_matcher.group());

        }
        System.out.println("-------------------------------------");
        while (my_matcher_2.find()) {
            System.out.println(my_matcher_2.group());

        }
    }
}
