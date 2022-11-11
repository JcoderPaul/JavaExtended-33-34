package Less_33_ch_2_RegExMultiSymbol;
/*
Пример квантификатора: '{n}' - n- символов подряд.
Например:
- 'a{3}' - может означать 3-х кратное повторение буквы 'a', т.е. 'aaa'
- '[0-9]{4}' - означает 4-х кратное повторение цифровых символов подряд 2341, 6412, 4375 и т.д.
- '[A-Z]{6}' - означает 6-и кратное повторение больших букв подряд BDRFRT, BSSSSB, FDHHRJ и т.д.
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Less_33_RegExMultiSymbol_Step3 {
    public static void main(String[] args) {
        // Строка где будет вестись поиск
        String my_str = "fSt&2_()4dde,)36wWwwRtrRywASww4($5y4&^63_4g";
        /*
        Ищем тремя равносильными способами. В данном случае применение
        квантификатора {n} будет означать, последовательность n - любых
        букв, цифр или '_', все остальные символы будут игнорироваться.

        В данном примере мы ищем 3-и подряд буквы в любом регистре и цифры,
        естественно символы (,):?%$* и т.д. в выборку не попадают.

        Шаг 1. Создаем паттерн, шаблон для поиска на основе RegEx.
        */
        Pattern my_meta_pattern = Pattern.compile("\\w{3}");
        Pattern my_range_pattern = Pattern.compile("[a-zA-Z_0-9]{3}");
        Pattern my_neg_meta_pattern = Pattern.compile("[^\\W]{3}");
        /*
        Наш сопоставитель (сверятель) тот, кто находит совпадения
        Наш шаблон 'my_pattern' сопоставляем со строкой 'my_str'
        переданной в аргументе нашему сопоставителю *.matcher(my_str).
        1. создали где мы будем искать;
        2. создали что мы будем искать;
        3. запустили механизм сопоставления передав в него 'что-с-чем'

        Шаг 2. Создаем сравниватель, пытаемся сопоставить всю входную
        последовательность (нашу исследуемую строку) с шаблоном.
        */
        Matcher my_meta_matcher = my_meta_pattern.matcher(my_str);
        Matcher my_range_matcher = my_range_pattern.matcher(my_str);
        Matcher my_neg_meta_matcher = my_neg_meta_pattern.matcher(my_str);
        /*
        На нашем сопоставители вызываем метод *.find(), найти совпадение.
        При нахождении совпадения возвращается true, при отсутствии таковых
        false.

        Шаг 3. Используем методы сравнивателя для получения необходимой
        информации из сопоставления регулярного выражения и входящего
        набора данных.
        */
        System.out.print("Совпадение по метасимволу и квантификатору -> ");
        while (my_meta_matcher.find()) {
            System.out.print(my_meta_matcher.group() + " | ");
        }

        System.out.println("\n--------------------------------------------------------------");
        System.out.print("Совпадение по набору с негативным исключением -> ");
        while (my_range_matcher.find()) {
            System.out.print(my_range_matcher.group() + " | ");
        }
        System.out.println("\n--------------------------------------------------------------");
        System.out.println("С индексами начала вхождений: ");
        while (my_neg_meta_matcher.find()) {
            System.out.println("Входной индекс: '" + my_neg_meta_matcher.start() +
                               "' найденная последовательность -> " + my_neg_meta_matcher.group());

        }
    }
}
