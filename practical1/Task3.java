package practical1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
        // если число отрицательное, и вернуть false если положительное.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        System.out.println(number);
        System.out.println(checkNumberAntonyms(number));
    }

    private static boolean checkNumberAntonyms(int number) {

        return number < 0;
    }
}