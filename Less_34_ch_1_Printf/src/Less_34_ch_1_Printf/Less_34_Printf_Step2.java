package Less_34_ch_1_Printf;
/*
Простые примеры форматирование вывода с помощью System.out.printf().
Особенность метода в том, что System.out.print() и System.out.println()
принимают один аргумент, а *.printf() может принимать несколько аргументов.
*/
public class Less_34_Printf_Step2 {
    public static void main(String[] args) {

        System.out.println("------------------------------------------------");
        float r = 71.8986f;
        System.out.printf("x = %f \n", r);
        System.out.printf("x = %e \n", r);

        System.out.println("------------------------------------------------");
        char symbol = 'r';
        System.out.printf("symbol = %c \n", symbol);

        System.out.println("------------------------------------------------");
        int number = 23;
        System.out.printf("number = %d \n", number);

        System.out.println("------------------------------------------------");
        System.out.printf("%s \n", "Hello Word!");

    }
}

