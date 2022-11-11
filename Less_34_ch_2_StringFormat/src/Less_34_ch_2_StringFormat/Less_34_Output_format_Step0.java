package Less_34_ch_2_StringFormat;

import java.util.Formatter;

/*
Простые примеры форматирование вывода с помощью *.format().
Данный *.format() метод позволяет сохранить нашу
отформатированную информацию, а не просто вывести ее на экран.
*/
public class Less_34_Output_format_Step0 {
    public static void main(String[] args) {
        // Шаг 1. Создаем объект класса Formatter
        Formatter f = new Formatter();
        // Шаг 2. Применяем его метод *.format() к данным
        String prn = String.valueOf(f.format("This %s is about %S %c", "book", "java", '8'));
        // Шаг 3. выводим на печать
        System.out.println(prn);

        System.out.println("------------------------------------------------------------");
        double x = 1000.0 / 3.0;
        System.out.println("Строка без форматирования: " + x);
        System.out.println("------------------------------------------------------------");
        /*
        Объект Formatter является Appendable и все применения
        метода *.format() ложатся в него. В данном примере, для
        красоты отображения, применяется перевод строки %n.
        */
        Formatter formatter = new Formatter();
        formatter.format("Строка c форматированием: %.2f%n", x);
        formatter.format("Строка c форматированием: %8.2f%n", x);
        formatter.format("Строка c форматированием: %16.2f%n", x);
        System.out.println(formatter);
    }
}