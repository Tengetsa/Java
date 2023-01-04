package practical3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Task1Version1 {

    public static void main(String[] args) {
        // Пусть дан произвольный список целых чисел,
        // удалить из него четные числа (в языке уже есть что-то готовое для этого)

        sortingTheList(addList());
    }


    private static List<Integer> addList() {
        Random random = new Random();
        int length = 10;

        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            arrList.add(random.nextInt(30));
        }
        System.out.println(arrList);
        return arrList;


    }
    private static void sortingTheList(List<Integer> arrList){
        int index = 0;
        while (index < arrList.size()) {
            if (arrList.get(index) % 2 == 0) {
                arrList.remove(index);
            } else {
                index++;
            }
        }

        System.out.println(arrList);
    }

}