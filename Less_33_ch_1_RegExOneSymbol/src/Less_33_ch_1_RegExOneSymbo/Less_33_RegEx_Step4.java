package Less_33_ch_1_RegExOneSymbo;
/*
Пример на: [e-j3-6] - любой символ из диапазона от e до j или от 3 до 6
(т.е. один символ или e или f или g или h или i или j или 3 или 4 или 5 или 6)
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Less_33_RegEx_Step4 {
    public static void main(String[] args) {
        // Строка где будет вестись поиск
        String my_str = "kreabc4-7reabw-abcj34-tbc434-eabcf3-kre456-abc5e-rt45ff";
        /*
        Ищем последовательность:
        'abc + [один любой из символов в диапазоне от e до j или из диапазона от 3 до 6]',
        например: 'abc5' или 'abcf'
        */
        Pattern my_pattern = Pattern.compile("abc[e-j3-6]");
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
