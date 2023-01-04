package practical1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,не
        // високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
        // при этом каждый 400-й – високосный.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();
        System.out.println( leapYear(year));
    }

    private static boolean leapYear(int year) {
        return year%4 == 0 && year%100 != 0 || year%400 == 0;
    }
}