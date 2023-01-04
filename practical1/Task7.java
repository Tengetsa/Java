package practical1;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        // Задать пустой целочисленный массив длиной 100.
        // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

        Random random = new Random();
        int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 100);
        }
        System.out.println(Arrays.toString(arr));
    }
}