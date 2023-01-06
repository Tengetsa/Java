package practical4;

import java.util.LinkedList;
import java.util.Scanner;

public class MyStack {
    // Написать метод, который принимает массив элементов, помещает их в стек и выводит на консоль содержимое стэка.

    private static final LinkedList<Integer> stack = new LinkedList<>();
    public static void main(String[] args) {

        menu();
    }

    private static void menu() {

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Введите пункт меню: %n 1. Добавить в stack %n 2. Посмотреть послеедний элемент  " +
                    "%n 3. Посмотеть последний элемент и удалить его %n 4. Посмотреть stack %n 5. Стоп %n");
            String num = scanner.nextLine();

            if (num.length() == 0) {
                System.out.println("Строка недолжна быть пустой");
                continue;
            }
            switch (num) {
                case "1" -> push(addNum());
                case "2" -> System.out.println(peek());
                case "3" -> System.out.println(pop());
                case  "4" -> System.out.println(stack);
                case  "5" -> System.exit(0);
            }

        }
    }

    private static Integer addNum() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    private static void push(int number) {

        stack.add(number);
        System.out.println(stack);
    }

    private static Integer peek() {
        return stack.get(stack.size() - 1);
    }

    private static Integer pop() {

        int number = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return number;

    }
}
