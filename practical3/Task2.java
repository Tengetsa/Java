package practical3;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    private static final List<Integer> list = Arrays.asList(7, 14, 6, 9, 3, 2, 22, 13);

    public static void main(String[] args) {
        // Задан целочисленный список ArrayList. Найти минимальное,
        // максимальное и среднее арифметическое из этого списка.

        valuesOfListItems();
    }

    private static void valuesOfListItems() {
        int min = list.get(0);
        int max = 0;
        int temp = 0;

        for (int j : list) {
            if (min > j) {
                min = j;
            }
            if (max < j) {
                max = j;
            }
            temp += j;
        }

        System.out.printf("Минимальное число = %d, максимальное число = " +
                "%d среднее арифметическое %d", min , max, temp / list.size());
    }
}