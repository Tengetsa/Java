package practical2;

import java.util.Objects;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        // Напишите метод, который принимает на вход строку (String) и
        // определяет является ли строка палиндромом (возвращает boolean значение).
        palindrome();
    }

    private static void palindrome() {

        System.out.println("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
        System.out.println(checkPalindrome(str));
    }

    private static boolean checkPalindrome(String str) {

        String [] arr = str.split("");
        int len = arr.length - 1;
        boolean test = false;
        for (int i = 0; i < arr.length/2; i++) {
            test = Objects.equals(arr[i], arr[len]);
            len--;
        }

        return test;
    }
}