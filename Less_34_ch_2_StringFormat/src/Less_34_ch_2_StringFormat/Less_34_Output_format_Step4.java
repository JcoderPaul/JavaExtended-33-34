package Less_34_ch_2_StringFormat;

import java.util.Formatter;
import java.util.Locale;

/*
Простые примеры форматирование вывода с помощью *.format().
*/
public class Less_34_Output_format_Step4 {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        StringBuilder sb = new StringBuilder();
        // Отправляем весь вывод в Appendable объект sb
        Formatter formatter = new Formatter(sb, Locale.US);

        // Явные индексы аргументов могут использоваться для изменения порядка вывода.
        System.out.println(formatter.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d"));
        // -> " d  c  b  a"
        System.out.println("------------------------------------------------");
        /*
        Необязательная локаль в качестве первого аргумента может быть
        использована для форматирования чисел в зависимости от локали.
        Точность и ширина могут быть заданы для округления и выравнивания
        значения.
        */
        formatter.format(" | ");
        System.out.println(formatter.format(Locale.FRANCE, "e = %+10.4f", Math.E));
        // ->  d  c  b  a | e =    +2,7183
        System.out.println("------------------------------------------------");
        /*
        Флаг '(' можно использоваться для форматирования отрицательных
        чисел. Т.е. ставятся круглые скобки, а не знак минус. Разделитель
        групп, знак ',' позволяет отделять десятки от сотен и т.д.
        */
        formatter.format(" | ");
        System.out.println(formatter.format("Amount gained or lost since last statement: $ %(,.2f",
                -6217.5875));
        // -> d  c  b  a | e =    +2,7183 | Amount gained or lost since last statement: $ (6,217.59)
    }
}

