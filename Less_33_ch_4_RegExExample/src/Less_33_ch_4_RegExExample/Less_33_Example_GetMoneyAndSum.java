package Less_33_ch_4_RegExExample;
/*
Задача: Из простой строки содержащей текст и цифры,
извлечь цифровые значения и найти их сумму.

Пример использования методов класса Matcher:
- *.start();
- *.end();
- *.find();
*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Less_33_Example_GetMoneyAndSum {
    public static void main(String[] args)  {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        /*
        Создаем объект "pat" класса Pattern (компилируем шаблон регулярного выражения)
        в который помещаем регулярное выражение "\d+" экранирую его "\" это выражение
        означает любой числовой символ неограниченное количество раз подряд.
        */
        Pattern pat = Pattern.compile("\\d+");
        // Создаем переменную 'match'
        Matcher match = pat.matcher(text);
        int sum = 0;
        /*
        Запускаем цикл, который будет работать до тех пор, пока метод *.find() ищет
        все совпадения с регулярным выражением в переданной строке 'text' (нашел значит
        true и продолжаем поиск, нет - false и цикл заканчивается)
        Метод *.find() вызывается неоднократно, чтобы найти все совпадающие
        подпоследовательности. При каждом вызове метода find() сравнение начинается
        с того места, где было завершено предыдущее сравнение.
        */
        while (match.find())
        {
            /*
            Извлекаем подстроку с индекса полученного методом *.start()
            до индекса полученного методом *.end(), в нашем случае это и
            будет последовательность цифр.
            */
            String value = text.substring(match.start(), match.end());
            /*
            Текстовую последовательность цифр преобразуем в число
            и помещаем в переменную result целочисленного типа int
            */
            System.out.print("Начальный индекс вхождения '" + match.start() + "' -> ");
            int result = Integer.parseInt(value);
            sum = sum + result; // Суммируем
            System.out.println(result);
        }
        // Выводим на экран сумму
        System.out.println("Сумма: " + sum);
    }
}