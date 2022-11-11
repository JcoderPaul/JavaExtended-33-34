package Less_33_ch_1_RegExOneSymbo;
/*
Пример метасимвола: '\w' - цифровой символ, буквенный и '_', равносилен набору [a-zA-Z_0-9]
Пробел, знаки препинания и другие символы сюда не входят.
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Less_33_RegEx_Step10 {
    public static void main(String[] args) {
        // Строка где будет вестись поиск
        String my_str = "2_4 d, 3:6 w4$5y-4&^6 3_4g";
        /*
        Ищем двумя равносильными способами:
        - через диапазон [a-zA-Z_0-9], буквы в обоих регистрах, цифры и '_'
        - через метасимвол \w
        */
        Pattern my_meta_pattern = Pattern.compile("\\w");
        Pattern my_range_pattern = Pattern.compile("[a-zA-Z_0-9]");
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
        System.out.print("Совпадение по метасимволу -> ");
        while (my_meta_matcher.find()){
            System.out.print( my_meta_matcher.group() + " ");
        }

        System.out.println("\n--------------------------------------------------------------");
        System.out.print("Совпадение по набору -> ");
        while (my_range_matcher.find()){
            System.out.print( my_range_matcher.group() + " ");
        }
    }
}
