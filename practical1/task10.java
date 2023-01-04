package practical1;

import java.util.Arrays;

public class task10 {
    public static void main(String[] args) {
        // Написать метод, принимающий на вход два аргумента: len и initialValue,
        // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

        int len = 6;
        int initialValue = 12;
        System.out.println(Arrays.toString(addArr(len, initialValue)));
    }

    private static int[] addArr(int len, int initialValue) {
        int [] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}