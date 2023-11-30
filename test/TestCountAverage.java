
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestCountAverage {

    /*
     * В данной задаче мы тестируем для максимального покрытия три возможных вывода:
     * Наибольшее значение в первом списке;
     * Во втором списке;
     * Равные значения списков.
     * Что и обуславливает выбор сценариев в рамках текущей задачи, а именно -
     * "Ваша цель - достичь минимум 90% покрытия".
     * То есть проверяем все три случая
     */

    @Test
    public void testFirstBigger() {
        int[] firstArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] secondArray = new int[] { 1, 1, 1, 1, 5, 6, 7, 8, 9 };

        assertThat(CountAverage.countingAverage(firstArray, secondArray))
                .isEqualTo("Первый список имеет большее среднее значение");
    }

    @Test
    public void testSecondBigger() {
        int[] firstArray = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int[] secondArray = new int[] { 1, 2, 3, 4, 9, 9, 9 };

        assertThat(CountAverage.countingAverage(firstArray, secondArray))
                .isEqualTo("Второй список имеет большее среднее значение");
    }

    @Test
    public void testEquals() {
        int[] firstArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] secondArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        assertThat(CountAverage.countingAverage(firstArray, secondArray))
                .isEqualTo("Средние значения равны");
    }
}
