package Less_33_ch_5_RegExStringReplaceAll;
/*
Пример работы метода *.replaceFirst() класса String
*/
public class Less_33_StringReplaceFirst_Step2 {
    public static void main(String[] args) {
           // Исходная строка
           String original_string = "Что жизнь? Базар… Там друга не ищи.\n" +
                                    "Что жизнь? Ушиб… Лекарства не ищи.\n" +
                                    "Сам не меняйся. Людям улыбайся.\n" +
                                    "Но у людей улыбок – не ищи.";
           // На что меняем
           String insert = "точно нет!";
           // Что меняем
           String regex = "не ищи\\.";
           // Запускаем метод по замене первого найденного вхождений 'regex' на 'insert'
           String afterReplace = original_string.replaceFirst(regex, insert);
           // Вывод на экран результат
           System.out.println(afterReplace);
    }
}
