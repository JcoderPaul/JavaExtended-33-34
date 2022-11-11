package Less_33_ch_2_RegExMultiSymbol;
/*
1. Найдем все буквенно-цифровые последоваетльности игнорируя знаки препинания
2. Найдем номера домов и квартир
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Less_33_RegExMultiSymbol_Step4 {
    public static void main(String[] args) {
        // Строка где будет вестись поиск
        String my_str =
                "Куралесов Василий, Россия, Москва, пр-т. Вернадского, дом. 34, кв. 69, " +
                "email: vasyakuralesov@gmail.com, Почтовый индекс: 458962, тел.: +759845689125; " +
                "Хайд Стивен, США, Нью-Йорк, ул. Мэддисон, дом. 278, кв. 169, " +
                "email: jekilandhide@gmail.com, Почтовый индекс: DA-2345, тел.: +7555648953; "+
                "Линд Дуглас, Австралия, Брисбен, ул. Гарден Роуд, дом. 14, кв. 5, " +
                "email: boogieboy@yahoo.com, Почтовый индекс: Au-34545, тел.: +73426489246; ";
        /*
        Задали регулярное выражение которое работает с набором любых
        русских и англиских букв в обоих регистрах и цифрами, а так
        же символ '-'
        */
        Pattern my_pattern = Pattern.compile("[a-zA-ZА-Яа-я0-9-]+");
        Matcher my_matcher = my_pattern.matcher(my_str);
        /*
        Задали регулярное выражение которое работает с набором:
        '. пробел [любое количество цифр] ,' точку экранируем
        т.к. нам нужна именно точка, а не метасимвол - 'любой символ'
        И так мы фиксируем адреса домов и номера квартир.
        */
        Pattern my_pattern_2 = Pattern.compile("\\. [0-9]+,");
        Matcher my_matcher_2 = my_pattern_2.matcher(my_str);

        while (my_matcher.find()) {
            System.out.println(my_matcher.group());

        }
        System.out.println("-------------------------------------");
        while (my_matcher_2.find()) {
            /*
            Метод my_matcher_2.group() выдаст нечто похожее на '. 234,'
            Нам хотелось бы получить чистые цифры, поэтому еще раз
            применяем регулярное выражение в методе *.replaceAll(),
            и заменяем символы точка, запятая и пробел на пустоту.
            */
            String str_res = my_matcher_2.group().replaceAll("[.,\\s]","");
            System.out.println(str_res);

        }
    }
}
