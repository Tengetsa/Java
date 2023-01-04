package practical4;

import java.util.LinkedList;

public class Task1 {

    public static void main(String[] args) {
        // 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

        task();
    }

    private static void task() {
        int[] arr = {4, 5, 7, 8, 2, 45, 34};
        LinkedList<Integer> listL = new LinkedList<>();
        for (int j : arr) {
            listL.add(j);
        }


        for (int i = 0; i < listL.size() - 1; i++) {
            listL.add(listL.size() - i, listL.getFirst());
            listL.removeFirst();
        }

//        int temp = 0;
//        while (temp != listL.size() - 1) {
//            listL.add(listL.size()-temp, listL.getFirst());
//            listL.removeFirst();
//            temp++;
//        }
        System.out.println(listL);

    }

}
