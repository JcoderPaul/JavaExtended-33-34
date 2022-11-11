package Less_34_ch_1_Printf;
/*
Простые примеры форматирование вывода с помощью System.out.printf().
Особенность метода в том, что System.out.print() и System.out.println()
принимают один аргумент, а *.printf() может принимать несколько аргументов.
*/
public class Less_34_Printf_Step3 {
    public static void main(String[] args) {

        System.out.printf("%d \n", 8);
        System.out.printf("% d \n", 8);
        System.out.printf("%+d \n", +8);
        System.out.printf("%#o \n", 8);
        System.out.printf("%#f \n", 8.);

        System.out.printf("%9s %d \n", "Tom", 38);
        System.out.printf("%-9s %d \n", "Tom", 38);


    }
}

