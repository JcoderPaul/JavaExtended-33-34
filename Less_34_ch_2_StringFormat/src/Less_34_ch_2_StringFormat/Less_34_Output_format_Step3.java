package Less_34_ch_2_StringFormat;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.MAY;

/*
Простые примеры форматирование вывода с помощью System.out.format().
Форматирование дат, времени и т.д. В данном случае мы каждый раз
создаем отформатированную строку, с которой можно работать, а
не только выводить на печать.
*/
public class Less_34_Output_format_Step3 {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        // Writes a formatted string to System.out.
        System.out.format("Local time: %tT", Calendar.getInstance());
        // -> "Local time: часы:минуты:секунды"
        Calendar c = new GregorianCalendar(1995, MAY, 23);
        String s = String.format("Duke's Birthday: %1$tm %1$te, %1$tY", c);
        System.out.println("\n" + s);
        // -> s == "Duke's Birthday: 05 23, 1995"
        System.out.println("------------------------------------------------");

    }
}

