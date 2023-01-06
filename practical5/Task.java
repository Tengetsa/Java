package practical5;

import java.util.*;

public class Task {
    // Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
    // Учесть, что под одной фамилией может находиться несколько телефонных номеров.
    // Важно: Каждый пользователь - уникальный ключ в коллекции. В выбранной Вами коллекции не должно
    // быть повторений имён
    //
    // Неправильно:
    // 911 - Тимофей
    // 112 - Тимофей
    // 03 - Тимофей
    // .
    // Правильно:
    // Тимофей: 911, 112, 03

    private static final Map<String, ArrayList<String>> phoneNote = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        noteBook();
    }

    private static void noteBook() {

        while (true) {
            System.out.printf("Введите пункт меню: %n 1. Добавить в phoneNote %n 2. Посмотреть phoneNote  " +
                    " %n 3. Стоп %n");
            String num = scanner.nextLine();

            if (num.length() == 0) {
                System.out.println("Строка недолжна быть пустой");
                continue;
            }
            switch (num) {
                case "1" -> addPhone(sureName(), numPhone());
                case "2" -> printPhoneNote();
                case "3" -> System.exit(0);
            }

        }
    }

    private static void printPhoneNote() {

        for (String key : Task.phoneNote.keySet()) {

            System.out.printf("%s: %s%n", key, phoneNote.get(key));
        }
    }

    private static String sureName() {

        System.out.println("Введите фамилию: ");
        return scanner.nextLine();
    }

    private static String numPhone() {

        System.out.println("Введите номер телефона: ");
        return scanner.nextLine();
    }

    private static void addPhone(String sureName, String numPhone) {
//        ArrayList<String> temp = new ArrayList<>();

        if (phoneNote.containsKey(sureName)){
            phoneNote.get(sureName).add(numPhone);

//            temp.add(String.valueOf(phoneNote.get(sureName).toString()));
//            temp.add(numPhone);
//            phoneNote.put(sureName, temp);
        } else {
            phoneNote.putIfAbsent(sureName, new ArrayList<>(Collections.singleton(numPhone)));

//            phoneNote.put(sureName, number(numPhone));
        }
    }

//    private static ArrayList<String> number(String numPhone) {
//
//        ArrayList<String> number = new ArrayList<>();
//        number.add(numPhone);
//        return number;
//    }


}


