package Less_33_ch_3_RegExStringSplit;

public class Less_33_RegExStringSplit_Step2 {
    public static void main(String[] args) {
        String my_str = "Куралесов Василий, Россия, Москва, пр-т. Вернадского, дом. 34, кв. 69, " +
                        "email: vasyakuralesov@gmail.com, Почтовый индекс: 458962, тел.: +759845689125; " +
                        "Хайд Стивен, США, Нью-Йорк, ул. Мэддисон, дом. 278, кв. 169, " +
                        "email: jekilandhide@gmail.com, Почтовый индекс: DA-2345, тел.: +7555648953; "+
                        "Линд Дуглас, Австралия, Брисбен, ул. Гарден Роуд, дом. 14, кв. 5, " +
                        "email: boogieboy@yahoo.com, Почтовый индекс: Au-34545, тел.: +73426489246; ";
        // Строка для сравнения
        String str_two = "boogieboy@yahoo.com";
        /*
        Метод *.matches() класса String для сравнения исходной строки
        с регулярным выражением, которое соответствует последовательности
        символов электронной почты.
        */
        boolean res_compare_regex = str_two.matches("\\w+@\\w+\\.(ru|com)");
        // Результат сравнения
        System.out.println("boogieboy@yahoo.com - это электронный адрес? -> " + res_compare_regex); // true
//**************************************************************************************************************
        System.out.println("-------------- Пример работы метода *.split() --------------");
        /*
        В качестве разделителя будем использовать знаки ',' или ':' или ';'
        Метод *.split() вызывается на строке и принимает в качестве аргумента
        регулярное выражение.
        */
        String[] bd_after_split = my_str.split("[,:;]");
        for (int i = 0; i < bd_after_split.length; i++){
            System.out.println((bd_after_split[i]).trim());
        }
    }
}
