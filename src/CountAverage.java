/*Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:
a. Рассчитывает среднее значение каждого списка.
b. Сравнивает эти средние значения и выводит соответствующее сообщение:
- ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
- ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
- ""Средние значения равны"", если средние значения списков равны. */

public class CountAverage {

    public static String countingAverage(int[] arr1, int[] arr2) {
        float averageArr1;
        float averageArr2;
        int sumArr1 = 0;
        int sumArr2 = 0;

        for (int num : arr1) {
            sumArr1 += num;
        }

        for (int num : arr2) {
            sumArr2 += num;
        }

        averageArr1 = (float) sumArr1 / arr1.length;
        averageArr2 = (float) sumArr2 / arr2.length;

        if (averageArr1 > averageArr2) {
            return "Первый список имеет большее среднее значение";
        } else if (averageArr2 > averageArr1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
