package Less_33_ch_2_RegExMultiSymbol;
/*
Пример квантификатора: '+' - некий символ один или несколько раз.
Например:
- 'a+' - может означать любое количество букв 'a' подряд, a, aa, aaa, aaaa и т.д.
- '[0-9]+' - означает любое количество цифровых символов подряд 1, 12, 435, 646645 и т.д.
- '[A-Z]+' - означает любое количество больших букв подряд B, BB, FDRJ, VDAEHG и т.д.
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Less_33_RegExMultiSymbol_Step1 {
    public static void main(String[] args) {
        // Строка где будет вестись поиск
        String my_str = "2_4d, 36w4 $5y4&^63_4g";
        /*
        Ищем двумя равносильными способами. В данном случае применение
        квантификатора '+' будет означать, последовательность любых букв,
        цифр или '_', все остальные символы будут игнорироваться.
        */
        Pattern my_meta_pattern = Pattern.compile("\\w+");
        Pattern my_range_pattern = Pattern.compile("[a-zA-Z_0-9]+");
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
        System.out.print("Совпадение по метасимволу и квантификатору -> ");
        while (my_meta_matcher.find()){
            System.out.print( my_meta_matcher.group() + " | ");
        }

        System.out.println("\n--------------------------------------------------------------");
        System.out.print("Совпадение по набору с исключением [a-zA-Z_0-9]+ -> ");
        while (my_range_matcher.find()){
            System.out.print( my_range_matcher.group() + " | ");
        }
    }
}
