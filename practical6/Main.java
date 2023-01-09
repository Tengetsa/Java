package practical6;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    // Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // Создать множество ноутбуков (ArrayList).
    // Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    // Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
    // Выводить только те ноутбуки, что соответствуют условию

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        filter(laptops());
    }

    public static ArrayList<String> laptops() {
        Laptop irbis_bn77 = new Laptop("Irbis NB77", "Intel Atom Z3735F", "eMMC - 32GB",
                "Windows10", "2 GB", "13.3", "HD", "black");

        Laptop asus_laptop_15 = new Laptop("ASUS Laptop 15 F515JA-EJ672T", "Intel Pentium 6805U",
                "SSD - 128 GB", "Windows10", "4 GB", "15.6",
                "Full HD (1920x1080)", "Silver");

        Laptop acer_aspire_3 = new Laptop("Acer Aspire 3 A315-34-P70N",
                "Intel Pentium Silver N5030", "SSD - 128 GB", "Windows10",
                "4 GB", "15.6", "Full HD (1920x1080)", "black");

        Laptop chuwi_corebook_x_14 = new Laptop("Chuwi CoreBook X 14", "Intel Core i3-10110U",
                "SSD - 256", "Windows11", "8 GB", "14",
                "2160x1440", "black");

        Laptop msi_modern_15 = new Laptop("MSI Modern 15 B5M-001XRU", "AMD Ryzen 5 5625U",
                "SSD - 256", "Absence", "8 GB", "15.6",
                "Full HD (1920x1080)", "Black");

        Laptop huawei_matebook_d16 = new Laptop("HUAWEI MateBook D16 RLEF-X",
                "Intel Core i7-12700H", "SSD - 512", "Windows11",
                "16 GB", "16", "1920x1200", "Black");

        ArrayList<String> listLaptop = new ArrayList<>();
        listLaptop.add(String.valueOf(irbis_bn77));
        listLaptop.add(String.valueOf(asus_laptop_15));;
        listLaptop.add(String.valueOf(acer_aspire_3));;
        listLaptop.add(String.valueOf(chuwi_corebook_x_14));;
        listLaptop.add(String.valueOf(msi_modern_15));;
        listLaptop.add(String.valueOf(huawei_matebook_d16));;


        return listLaptop;
    }

    private static void filter(ArrayList<String> laptops) {

        System.out.println("""
                    Здрасвуйте, Укажите номер критерия фильтрации ноутбуков:
                    1. Размер накопителя
                    2. Размер оперативной памяти
                    3. Color""");
        String userRequest = scanner.nextLine();

        if (Objects.equals(userRequest, "1")) {
            choiceSSD(laptops);
        } else if (Objects.equals(userRequest, "2")) {
            choiceOperativeMemore(laptops);
        } else if (Objects.equals(userRequest, "3")) {
            choiceColor(laptops);
    }

    }


    private static void choiceSSD(ArrayList<String> laptops) {

        System.out.println("Укажите размер накопителя");
        System.out.println("32, 128, 256, 512");
        String sizeSSD = scanner.nextLine();

        if (Objects.equals(sizeSSD, "32")) {

            System.out.println(laptops.get(0));

        } else if (Objects.equals(sizeSSD, "128")) {

            System.out.println(laptops.get(1));
            System.out.println(laptops.get(2));

        } else if (Objects.equals(sizeSSD, "256")) {

            System.out.println(laptops.get(3));
            System.out.println(laptops.get(4));

        } else if (Objects.equals(sizeSSD, "512")) {

            System.out.println(laptops.get(5));
        }
    }

    private static void choiceOperativeMemore(ArrayList<String> laptops) {

        System.out.println("Укажите размер оперативной памяти");
        System.out.println("2, 4, 8, 16");
        String sizeOperativeMemore = scanner.nextLine();

        if (Objects.equals(sizeOperativeMemore, "2")) {

            System.out.println(laptops.get(0));

        } else if (Objects.equals(sizeOperativeMemore, "4")) {

            System.out.println(laptops.get(1));
            System.out.println(laptops.get(2));

        } else if (Objects.equals(sizeOperativeMemore, "8")) {

            System.out.println(laptops.get(3));
            System.out.println(laptops.get(4));

        } else if (Objects.equals(sizeOperativeMemore, "16")) {

            System.out.println(laptops.get(5));
        }
    }


    private static void choiceColor(ArrayList<String> laptops) {

        System.out.println("Укажите цвет");
        System.out.println("Black, Silver");
        String color = scanner.nextLine();

        if (Objects.equals(color, "Black")) {

            System.out.println(laptops.get(0));
            System.out.println(laptops.get(2));
            System.out.println(laptops.get(3));
            System.out.println(laptops.get(4));

        } else if (Objects.equals(color, "Silver")) {

            System.out.println(laptops.get(1));

        }
    }
}
