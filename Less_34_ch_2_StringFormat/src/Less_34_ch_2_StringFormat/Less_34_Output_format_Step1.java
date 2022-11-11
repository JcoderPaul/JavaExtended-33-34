package Less_34_ch_2_StringFormat;

import java.text.DecimalFormat;
/*
Простые примеры форматирование вывода с помощью *.format().
Форматирование с использованием класса DecimalFormat.
DecimalFormat используется для форматирования десятичных чисел.
Данный *.format() метод позволяет сохранить нашу
отформатированную информацию, а не просто вывести ее на экран.
*/
public class Less_34_Output_format_Step1 {
    public static void main(String[] args) {
        double num = 123.4567;

        /*
        Печатает только числовую часть числа с плавающей запятой,
        т.е. все содержимое до запятой (точки)
        */
        DecimalFormat ft = new DecimalFormat("####");
        System.out.println("Without fraction part: num = "
                + ft.format(num));

        // Ограничивает вывод до 2-ух знаков после запятой
        ft = new DecimalFormat("#.##");
        System.out.println(
                "Formatted to Give precision: num = "
                        + ft.format(num));

        /*
        Автоматически добавляет ноль(нули) в крайнюю правую часть,
        т.е. после запятой, для десятичного числа вместо # мы
        используем цифру 0
         */
        ft = new DecimalFormat("#.000000");
        System.out.println(
                "appended zeroes to right: num = "
                        + ft.format(num));

        /*
        Автоматически добавляет ноль к числовому значению до запятой,
        для десятичного числа вместо #, используем цифру 0
        */
        ft = new DecimalFormat("00000.00");
        System.out.println(
                "formatting Numeric part : num = "
                        + ft.format(num));

        // Форматирование с разделителем
        double income = 23456.789;
        ft = new DecimalFormat("$###,###.##");
        // Выделили отдельную текстовую переменную
        String str_for_prn = ft.format(income);
        System.out.println("your Formatted Dream Income : "
                + str_for_prn);
    }
}
