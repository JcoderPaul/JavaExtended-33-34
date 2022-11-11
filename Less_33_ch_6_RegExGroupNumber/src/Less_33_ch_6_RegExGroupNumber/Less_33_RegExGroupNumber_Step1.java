package Less_33_ch_6_RegExGroupNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Задача: представить номер банковской карты с датой и cvv
в удобном (красивом) виде, например:
- было -> 12341223123412340411543
- стало -> 04/11 1234 1223 1234 1234 (543)
Примеры работы методов класса Matcher:
- *.replaceAll();
- *.reset();
- *.group(number group);
*/
public class Less_33_RegExGroupNumber_Step1 {
    public static void main(String[] args) {
        String bank_card_num = "25376785889890760221323;23433689023446790612897;85796877957569241109734;";
        String regex = "(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(bank_card_num);
        /*
        Класс Matcher имеет свою реализацию метода *.replaceAll(), а также
        в функционале регулярных выражений существует понятие, как группа,
        или захваченная группа. Это последовательность символов внутри круглых
        скобок, например (XYZ). Если в текущем регулярном выражении есть
        несколько таких групп, то они нумеруются с 1, т.к. индекс ноль у самой
        основной группы или у самого регулярного выражения.

        Отсюда мы получили следующую возможность:
        Регулярное выражение: (\d{4}) (\d{4}) (\d{4}) (\d{4}) (\d{2}) (\d{2}) (\d{3})
        Номер группы:            1       2       3       4       5       6       7
        Еще раз !!! индекс '0' у самого регулярного выражения целиком !!!

        В методе *.replaceAll() мы поменяли группы местами и внесли изменения в
        способ отображения информации, добавив пробелы, скобки и знак '/' и
        поместили в новую строку.
        */
        String my_new_base_view = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
        /*
        Поскольку мы можем работать с группами перемещая их, значит мы
        можем их выводить по конкретному запросу, например гр. 7 и
        только ее.
        */
        System.out.println("------------------- Только группа 7 -------------------");
        // Сбрасываем состояние текущего сопоставителя.
        matcher.reset();
        while (matcher.find()){
            System.out.println(matcher.group(7));
        }
        System.out.println("------------------- Только группа 5/6 -------------------");
        // Сбрасываем состояние текущего сопоставителя.
        matcher.reset();
        while (matcher.find()){
            System.out.println(matcher.group(5) + "/" + matcher.group(6));
        }
        System.out.println("------------------- Группа 0 -------------------");
        // Сбрасываем состояние текущего сопоставителя.
        matcher.reset();
        while (matcher.find()){
            // Как и было упомянуто выше '0' - вся строка RegEx
            System.out.println(matcher.group(0));
        }
        System.out.println("------------------- База соответствий -------------------");
        /*
        Помещаем наши разбитые на отдельные номера карты в массивы,
        а затем в Map соответственно:
        'ключ' - старый номер;
        'значение' - новое отображение;
        Да можно было сделать проще, но .... продолжаем набивать руку.
        */
        String[] new_base = my_new_base_view.split(";");
        String[] old_base = bank_card_num.split(";");

        Map<String, String> old_mapping_new = new HashMap<>();

        for (int i = 0; i < new_base.length; i++) {
            old_mapping_new.put(old_base[i], new_base[i]);
        }

        for (Map.Entry entry: old_mapping_new.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
