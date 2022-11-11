package Less_34_ch_1_Printf;
/*
Простые примеры форматирование вывода с помощью System.out.printf().
Особенность метода в том, что System.out.print() и System.out.println()
принимают один аргумент, а *.printf() может принимать несколько аргументов.
*/
public class Less_34_Printf_Step1 {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------");
        // Простой вывод числа 100
        int x = 100;
        System.out.printf("Printing simple integer: x = %d\n", x); // x = 100
        System.out.println("------------------------------------------------");
        // Вывод числа Пи = Math.PI, с точностью до второго знака
        System.out.printf("Formatted with precision: PI = %.2f\n", Math.PI); // PI = 3,14
        System.out.println("------------------------------------------------");
        /*
        Как и в предыдущем примере, выводит число с точностью до 4-го знака,
        но по скольку (5.2) после двойки ничего нет, добавляет 3-и нуля.
        */
        float n = 5.2f;
        System.out.printf("Formatted to specific width: n = %.4f\n", n); // n = 5,2000
        System.out.println("------------------------------------------------");
        /*
        В данном случае форматирование следующее:
        - под все число выделяется 20 символов;
        - под значение после запятой(точки) 4-и знака (из всего 20 символьного набора);
        - выражение равняется по правому краю.
        */
        n = 2324435.3f;
        System.out.printf("Formatted to right margin: n = %20.4f\n", n); // n =         2324435,2500
        System.out.println("------------------------------------------------");
        /*
        Здесь спецификация преобразования представляет строку "%4.2f",
        где "4" - ширина поля (для вывода числа будут использоваться 4 цифры),
        а "2" - точность (2 цифры в дробной части).
        */
        n = 71.8986f;
        System.out.printf("Formatted to right margin: n = %4.2f \n", n); // n = 71,90
    }
}
