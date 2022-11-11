package Less_33_ch_1_RegExOneSymbo;
/*
Пример на: '.' - любой символ или буква или цифра.
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Less_33_RegEx_Step8 {
    public static void main(String[] args) {
        // Строка где будет вестись поиск
        String my_str = "kreab4-7reabw-abj34-tbc434-eabf3-kre456-ab5e-rt45ff";
        /*
        Ищем последовательность:
        'ab + [один любой символ]', например: 'ab4' или 'abw'
        */
        Pattern my_pattern = Pattern.compile("ab.");
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
        Простой счетчик, дающий понять, сколько раз было найдено искомое
        регулярное выражение в строке для поиска.
        */
        int count = 1;
        /*
        На нашем сопоставители вызываем метод *.find(), найти совпадение.
        При нахождении совпадения возвращается true, при отсутствии таковых
        false.
        */
        while (my_matcher.find()){

            System.out.print("Мы нашли -> " + my_matcher.group() + " , ");
            System.out.println("номер вхождения: " + count++); // Увеличиваем счетчик
            System.out.print("Начало вхождения '"+ my_matcher.start() + "' ");
            System.out.println("конец вхождения '"+ my_matcher.end() + "'");
            System.out.println("--------------------------------------------------------------");
        }
    }
}
