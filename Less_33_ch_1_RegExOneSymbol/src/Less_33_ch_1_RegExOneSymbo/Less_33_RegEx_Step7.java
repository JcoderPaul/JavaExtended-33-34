package Less_33_ch_1_RegExOneSymbo;
/*
Пример на: '[0-9]' равносильно '\d' - любой цифровой символ.
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Less_33_RegEx_Step7 {
    public static void main(String[] args) {
        // Строка где будет вестись поиск
        String my_str = "kreb6-krebw-abkj3-tbc4g-ke1f-kre6-abl5e-rt4kre";
        /*
        Ищем двумя равносильными способами:
        - через диапазон [0-9] любые цифры
        - через метасимвол \d
        */
        Pattern my_meta_pattern = Pattern.compile("\\d");
        Pattern my_range_pattern = Pattern.compile("[0-9]");
        /*
        Наш сопоставитель (сверятель) тот, кто находит совпадения
        Наш шаблон 'my_pattern' сопоставляем со строкой 'my_str'
        переданной в аргументе нашему сопоставителю *.matcher(my_str).
        1. создали где мы будем искать;
        2. создали что мы будем искать;
        3. запустили механизм сопоставления передав в него 'что-с-чем'
        */
        Matcher my_meta_matcher = my_meta_pattern.matcher(my_str);
        Matcher my_range_matcher = my_range_pattern.matcher(my_str);
        /*
        На нашем сопоставители вызываем метод *.find(), найти совпадение.
        При нахождении совпадения возвращается true, при отсутствии таковых
        false.
        */
        while (my_meta_matcher.find()){
            System.out.print( my_meta_matcher.group() + " ");
        }

        System.out.println("\n--------------------------------------------------------------");

        while (my_range_matcher.find()){
            System.out.print( my_range_matcher.group() + " ");
        }
    }
}
