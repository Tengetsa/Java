package practical3;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1Version2 {
    private static final List <Integer> listInt = Arrays.asList(9, 14, 6, 9, 3, 2, 22);

    public static void main(String[] args) {
        // Пусть дан произвольный список целых чисел,
        // удалить из него четные числа (в языке уже есть что-то готовое для этого)

        sortingTheList2();
    }

    private static void sortingTheList2() {
        List<Integer> list = listInt.stream().reduce(0, Integer::sum) % 2 == 0 ?
                listInt.stream().filter(p -> p % 2 == 0).collect(Collectors.toList()) :
                listInt.stream().filter(p -> p % 2 != 0).collect(Collectors.toList());
        System.out.println(list);
    }
}