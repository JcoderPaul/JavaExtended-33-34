package Less_33_ch_4_RegExExample;
/*
Пример замены элементов строки элементами коллекции Map.
Все примеры и уроки это напоминалки и поэтому в них,
многие комментарии повторяются.

Пример работы методов:
- *.group();
- *.appendReplacement();
- *.appendTail();
*/

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Less_33_Example_StrRegExReplacement {

    public static void main(String[] args) {
        // Есть некая строка
        String line_for_crack = "${env1}xxxxxxxxxx${env2}xxxx${env3}";
        // Создаем стрингбуфер для работы со строками
        StringBuffer my_string_buffer = new StringBuffer();
        // Создаем MAP для хранения, того, что нужно найти и того на что нужно заменить.
        Map<String, String> rep_symb_map = new HashMap<>();
        // Заполняем коллекцию ключами и элементами
        rep_symb_map.put("${env1}", "1");
        rep_symb_map.put("${env2}", "2");
        rep_symb_map.put("${env3}", "3");
        /*
        Класс Pattern представляет собой скомпилированное представление регулярного выражения.
        Класс не имеет публичных конструкторов, поэтому для создания объекта данного класса
        необходимо вызвать статический метод compile и передать в качестве первого аргумента
        строку с регулярным выражением, в нашем случае -> "(\\$\\{[^}]+\\})"
        */
        Pattern find_pattern = Pattern.compile("(\\$\\{[^}]+\\})");
        /*
        Matcher — класс, который представляет строку, реализует механизм согласования (matching)
        с регулярным выражением и хранит результаты этого согласования (используя реализацию методов
        интерфейса MatchResult). Не имеет публичных конструкторов, поэтому для создания объекта этого
        класса нужно использовать метод matcher класса Pattern.
        */
        Matcher line_matcher = find_pattern.matcher(line_for_crack);
        int count = 1; // Счетчик проходов
        /*
        Но результатов у нас еще нет. Чтобы их получить нужно воспользоваться методом find.
        Можно использовать matches — этот метод вернет true только тогда, когда вся строка
        соответствует заданному регулярному выражению, в отличие от find, который пытается
        найти подстроку, которая удовлетворяет всему регулярному выражению.
        */
        while (line_matcher.find())
        {
            /*
            Метод String *.group() возвращает символы предыдущего найденного совпадения.
            Чтобы сообщить об успешном поиске по пустой строке, этот метод возвращает
            пустую строку. Если сопоставитель еще не выполнял поиска или предыдущая
            операция поиска завершилась неудачей, генерируется исключение IllegalStateException.

            В данном случае:
            - при первом проходе: метод *.group() вернет '${env1}' - ключ Map, а метод *.get()
              вернет элемент по этому ключу, т.е. '1'
            - при втором проходе: метод *.group() вернет '${env2}' - ключ Map, а метод *.get()
              вернет элемент по этому ключу, т.е. '2'
            - при третьем проходе: метод *.group() вернет '${env3}' - ключ Map, а метод *.get()
              вернет элемент по этому ключу, т.е. '3'
            */
            String repStr = rep_symb_map.get(line_matcher.group());
            System.out.print(count++ + " -ый проход для поиска -> '" +repStr + "' встанет вместо "
                    + line_matcher.group());
            if (repStr != null){
                /*
                Реализует механизм «добавление-и-замена» (append-and-replace).
                Формирует объект StringBuffer (получен как параметр) добавляя
                replacement в нужные места. Устанавливает позицию, которая
                соответствует *.end() последнего результата поиска. После этой
                позиции ничего не добавляет.
                */
                line_matcher.appendReplacement(my_string_buffer, repStr);
                System.out.println(" -> и сформируем строку : " + my_string_buffer.toString());
            }
        }
        /*
        Используется после одного или нескольких вызовов appendReplacement
        и служит для добавления оставшейся части строки в объект класса
        StringBuffer, полученного как параметр.
         */
        line_matcher.appendTail(my_string_buffer);
        System.out.println("Было до замены -> " + line_for_crack);
        System.out.println("Стало после замены -> " + my_string_buffer.toString());
    }
}
