package Less_33_ch_1_RegExOneSymbo;
/*
Простая жестко фиксированная последовательность символов.
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Less_33_RegEx_Step1 {
    public static void main(String[] args) {
        // Строка где будет вестись поиск
        String my_str = "ABCD12 ABCE53 ABCFABC56GABCF";
        // Наш шаблон для поиска, 'ABC' - подряд один за другим, как есть
        Pattern my_pattern = Pattern.compile("ABC");
        /*
        Наш сопоставитель (сверятель) тот, кто находит совпадения
        Наш шаблон 'my_pattern' сопоставляем со строкой 'my_str'
        переданной в аргументе нашему сопоставителю *.matcher(my_str).
        1. создали где мы будем искать;
        2. создали что мы будем искать;
        3. запустили механизм сопоставления передав в него 'что-с-чем'
        */
        Matcher my_matcher = my_pattern.matcher(my_str);

        /*
        На нашем сопоставители вызываем метод *.find(), найти совпадение.
        При нахождении совпадения возвращается true, при отсутствии таковых
        false.
        */
        int count = 1;
        while (my_matcher.find()){
            /*
            Выводим на экран входную подпоследовательность, соответствующую
            предыдущему совпадению. Поскольку у нас RegEx простое 'ABC',
            то из нашей 'ABCD12 ABCE53 ABCFABC56GABCF' строки оно будет
            извлечено 5-ть раз.
            */

            System.out.println("Мы нашли -> " + my_matcher.group());
            System.out.println("Номер вхождения: " + count++);
            System.out.println("Начальная позиция вхождения: "+ my_matcher.start());
            System.out.println("Конечная позиция вхождения: "+ my_matcher.end());
            System.out.println("--------------------------------------------------------------");
        }
    }
}
