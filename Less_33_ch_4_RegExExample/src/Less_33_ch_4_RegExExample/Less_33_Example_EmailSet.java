package Less_33_ch_4_RegExExample;
/*
Задача:
Вводим с клавиатуры сочетание "команда + электронный адрес" через пробел,
либо просто команда:
- DELL - удалить элемент коллекции;
- ADD - добавить оригинальный элемент в коллекцию;
- LIST - вывести список электронных адресов на экран;
- EXIT - выйти из программы.
Адрес электронной почты должен проверяться на оригинальность и сохранятся
в некой коллекции. Три команды DELL, ADD, LIST - должны имитировать
минимальное управление элементами коллекции.
*/
import java.util.HashSet;
import java.util.Scanner;

import static java.lang.Character.isWhitespace;

public class Less_33_Example_EmailSet {

    static HashSet<String> emailSet = new HashSet<>();
    public static String emailName = "";

    public static void main(String[] args) {
    for(;;)
    {
        System.out.print("Input you command and/or Email: ");
        // Сканируем данные с клавиатуры и тут же обрезаем крайние пробелы
        String inputEmail = new Scanner(System.in).nextLine().trim();
        // Расчет длинны введенной строки
        String commandName = "";
        int countGap = 0;
        char gap = ' ';

        /*
        Задаем регулярное выражение для проверки, действительно ли введен
        Email. Регулярное выражения описывает искомую строку или сочетание
        символов идущих подряд:
        - (\w+) - любые буквенно-цифровые символы и знак подчеркивания;
        - '+' - означает неограниченное количество символов;
        - '@' - обычный символ "собаки";
        - (\w+\.) - набор буквенно-цифровых символов оканчивающийся 'точкой'
        - ([a-z]{2,4}) - набор латинских букв длинной от 2 до 4-х символов.
        И того (\w+)@(\w+\.)([a-z]{2,4}), незабываем про экранирование '\\'
        */
        String regexEmail = "(\\w+)@(\\w+\\.)([a-z]{2,4})";

        int countSymb = inputEmail.length();
        String enterComand = inputEmail;

        for (int i = 0; i < countSymb; i++) {
            // Переменной symb присваиваем значение i символа строки
            char symb = enterComand.charAt(i);
            /*
            Если переменная 'symb' пустой символ (пробел, табуляция),
            то 'true' и счетчик +1. Данная проверка нужна для разделения
            сочетания 'команда + емайл', например, ADD + EMAIL или DELL EMAIL.
            */
            if (isWhitespace(symb) == true) {
                countGap = countGap + 1;
            }
        }
        /*
        Если в полученной строке более одного разрыва, например, три слова, или
        между командой и электронным адресом более одного пробела, то такая строка,
        не принимается в работу и мы просим пользователя ввести данные снова.
        */
        if (countGap > 1)
        {
            System.out.println("Wrong Email address or command!");
        } else
        if (countGap == 1)
        {
            /*
            Находим индекс первого пробела, например:
            Введенная строка: A D D ' ' aaabbbbbffff@ddd.ert
            Индекс:           0 1 2  3  4
            */
            int findGap1 = enterComand.indexOf(gap);
            // Выводим команду начиная с первого символа
            commandName = enterComand.substring(0, findGap1);
            // и до значения первого пробела, а так же обрезаем пробелы по краям
            System.out.println("Command: " + commandName.trim());
            // Выводим емайл начиная с первого пробела и до конца строки
            emailName = enterComand.substring(findGap1);
            /*
            Выводим электронку на экран обрезав пробелы по краям,
            в этой напоминалке я вставляю метод *.trim() везде, для
            закрепления материала, и очевидно, только его я и запомню...
             */
            System.out.println("Email: " + emailName.trim());
            /*
            Проверяем полученный Емайл на правильность. Введенная
            с консоли строка, методом *.matches() сравнивается с
            регулярным выражением и при совпадении выдает true.
            */
            if (emailName.trim().matches(regexEmail) == false)
            {
                System.out.println("Wrong Email!");
            }
        } else
            commandName = inputEmail;
        /*
        Если мы получили строку без пробелов, то это может
        быть только команда. Значит проверяем, что за команду
        получила программа.
        */
        if (("DEL").equals(commandName.toUpperCase()) && emailName.trim().matches(regexEmail) == true) {
            delEmailFromSet(emailName);
        } else if (("ADD").equals(commandName.toUpperCase()) && emailName.trim().matches(regexEmail) == true) {
            addElemInSet(emailName);
        } else if (("LIST").equals(commandName.toUpperCase())) {
            outputAllElementOfSet();
        } else if (("EXIT").equals(commandName.toUpperCase())) {
            break;
        } else
            System.out.println("Unknown command or wrong Email!");

        System.out.println("**************** Test ****************");
        outputAllElementOfSet();
    }
        System.out.println("END PROGRAM");
}
    // Метод для добавления емайла в базу
    public static void addElemInSet(String addStr)
    {
        if (emailSet.add(addStr) == false)
        {
            System.out.println("There is such an email in the database!");
            System.out.println("Email is not added!");
        }
        emailSet.add(addStr);
    }
    // Вывод всей коллекции электронных адресов
    public static void outputAllElementOfSet()
    {
        if (emailSet.isEmpty() == true)
        {
            System.out.println("Empty base!");
        } else {
            for (String emailBase : emailSet) {
                System.out.println(emailBase);
            }
        }

    }
    // Удаление электронки из базы
    public static void delEmailFromSet(String delElem)
    {
        if (emailSet.contains(delElem) == true)
        {
            emailSet.remove(delElem);
        } else
            System.out.println("This email is not in the database!");
    }
}