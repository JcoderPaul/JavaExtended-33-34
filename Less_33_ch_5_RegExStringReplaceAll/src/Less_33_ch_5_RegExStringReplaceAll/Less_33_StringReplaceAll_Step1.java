package Less_33_ch_5_RegExStringReplaceAll;
/*
Пример работы метода *.replaceAll() класса String
*/
public class Less_33_StringReplaceAll_Step1 {
    public static void main(String[] args) {
           // Исходная строка
           String original_string = "Все царства мира – за стакан вина!\n" +
                                    "Всю мудрость книг – за остроту вина!\n" +
                                    "Все почести – за блеск и бархат винный!\n" +
                                    "Всю музыку – за бульканье вина!";
           // На что меняем
           String insert = "тарху";
           // Что меняем
           String regex = "ви";
           // Запускаем метод по замене всех вхождений 'regex' на 'insert'
           String afterReplace = original_string.replaceAll(regex, insert);
           // Вывод на экран результат
           System.out.println(afterReplace);
    }
}
