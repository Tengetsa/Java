package practical1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
        // (включительно), если да – вернуть true, в противном случае – false.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        Integer num1 = scanner.nextInt();
        System.out.println("Введите первое число: ");
        Integer num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println(result);
        System.out.println(numberRange(result));
    }


    public static boolean numberRange(int result) {
        return result >= 10 & result <= 20;
    }
}