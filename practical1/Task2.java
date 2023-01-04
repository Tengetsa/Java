package practical1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
        // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        Integer number = scanner.nextInt();
        checkNumber(number);
    }

    private static void checkNumber(Integer number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}