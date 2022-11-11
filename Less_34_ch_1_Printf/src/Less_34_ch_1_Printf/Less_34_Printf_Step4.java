package Less_34_ch_1_Printf;
/*
Простые примеры форматирование вывода с помощью System.out.printf().
Особенность метода в том, что System.out.print() и System.out.println()
принимают один аргумент, а *.printf() может принимать несколько аргументов.
*/
public class Less_34_Printf_Step4 {
    public static void main(String[] args) {
        /*
        Hello %1$s!%n - вставляем первый текстовый аргумент и сразу переводим строку.
        %1$s, how are you?%n - вставляем первый аргумента, выводим текст и переводим строку.
        Welcome to the site %2$s - вставляем второй текстовый аргумент
        */
        System.out.printf("Hello %1$s!%n%1$s, how are you?%n" +
                          "Welcome to the site %2$s", "John", "www.site.com");
    }
}

