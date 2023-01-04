package practical1;

public class Task11 {
    public static void main(String[] args) {
        // Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

        int [] arr = {5, 7, 3, 9, 5, 4};
        int min = arr[0];
        int max = 0;
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
            if (max < j) {
                max = j;
            }
        }
        System.out.printf("Минимальное число = %d, максимальное число = %d", min , max);
    }
}