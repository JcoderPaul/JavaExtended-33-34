package Less_34_ch_2_StringFormat;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Простые примеры форматирование вывода с помощью *.format().
Форматирование дат и разбор с использованием класса SimpleDateFormat
Этот класс присутствует в пакете java.text.
*/
public class Less_34_Output_format_Step2 {
    public static void main(String[] args) throws ParseException
    {
        // Форматирование по заданному шаблону в аргументе - "dd-MM-yyyy"
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        /*
        Отдельная переменная с которой можно работать и
        дальше, а не только вывести на печать
        */
        String str = ft.format(new Date());
        System.out.println("Formatted Date : " + str);

        // Парсинг заданной строки
        str = "02/18/1995";
        ft = new SimpleDateFormat("MM/dd/yyyy");
        Date date = ft.parse(str);
        /*
        Печатаем дату в соответствии с
        проанализированной и отформатированной строкой
         */
        System.out.println("Parsed Date : " + date);
    }
}
