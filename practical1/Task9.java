package practical1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        // если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
        // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте длину квадрата");
        int sqLe = scanner.nextInt();
        int [][] arr = new int[sqLe][sqLe];
        square(sqLe, arr);
    }


    private static void square(int sqLe, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            sqLe--;
            for (int j = 0; j < arr.length; j++) {
                if (i == j || j == sqLe) {
                    arr[i][j] = 1;
                } else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}