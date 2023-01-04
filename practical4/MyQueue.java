package practical4;

import java.util.LinkedList;
import java.util.Scanner;

public class MyQueue {
    // Написать метод, который принимает массив эдементов,
    // помещает их в очередь и выводит на консоль содержимое очереди.


    private static final LinkedList<Integer> queue = new LinkedList<>();
    public static void main(String[] args) {

        menu();
    }

    private static void menu() {

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Введите пункт меню: %n 1. Добавить в queue %n 2. Посмотреть послеедний элемент  " +
                    "%n 3. Посмотеть последний элемент и удалить его %n 4. Посмотреть queue %n 5. Стоп %n");
            String num = scanner.nextLine();

            if (num.length() == 0) {
                System.out.println("Строка недолжна быть пустой");
                continue;
            }
            switch (num) {
                case "1" -> push(addNum());
                case "2" -> System.out.println(top());
                case "3" -> System.out.println(poll());
                case  "4" -> System.out.println(queue);
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

        queue.add(0, number);
        System.out.println(queue);
    }

    private static Integer top() {
        return queue.get(0);
    }

    private static Integer poll() {

        int number = queue.get(queue.size() - 1);
        queue.remove(queue.size() - 1);
        return number;

    }
}
