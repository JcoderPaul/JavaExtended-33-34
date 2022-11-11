package Less_33_ch_4_RegExExample;
/*
Задача: Имитация парсинга списка покупок. Имеется входящая строка
из списка покупок, с разделителем между покупками знаком точка с запятой.
(количество товара, название товара, цена;).
Найти итоговые затраты на покупки.

Пример работы с методами *.split() и *.parseDouble().
*/

public class Less_33_Example_TotalCosts {

    public static void main(String[] args) {
        // Имеем некую строку содержащую список покупок, разделенную знаками ';' и ','
        String orderInfo = "1,огурцы,20.05;" +
                           "2,помидоры,123.45;" +
                           "3,яйца,0.50;" +
                           "4,лук,15.10;";
        // Выводим на экран результат работы статического метода
        System.out.println(getTotalOrderAmount(orderInfo));
    }

    static double getTotalOrderAmount(String orderInfo) {
        double totalAmount = 0d; // Буква 'd' после нуля нужна для подтверждения формата данных
        final String[] items = orderInfo.split(";"); // Создаем массив строк разделеных ';'

        for (String item : items) {
            /*
            Создаем подмассив 'itemInfo' строк разделенных ','
            Массив будет перезаписываться при каждом вызове следующего
            элемента массива 'items', но до этого из него будет извлечен
            2-ой элемент, т.е. цена.
            */
            final String[] itemInfo = item.split(",");
            /*
            Суммируем все элементы с индексом '2' (отсчет массива идет с '0'),
            предварительно строковую переменную преобразовав в double.
            */
            totalAmount += Double.parseDouble(itemInfo[2]);
        }
        // Метод возвращает результат суммирования.
        return totalAmount;
    }
}
