package practical1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Написать метод, которому в качестве аргументов передается строка и число,
        // метод должен отпечатать в консоль указанную строку, указанное количество раз;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        System.out.println("Введите число повторений");
        Integer num = scanner.nextInt();
        repeatingLines(str, num);
    }

    private static void repeatingLines(String str, Integer num) {
        int i = 0;
        while (i < num) {
            System.out.println(str);
            i++;
        }
    }
}