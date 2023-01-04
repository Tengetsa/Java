package practical2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class Task2 {
    static Logger logger = Logger.getLogger("practical2");
    public static void main(String[] args) {
        // Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
        // который запишет эту строку в простой текстовый файл, обработайте исключения.

        writingLineToFile(methotStr());

    }

    private static String methotStr() {
        StringBuilder sb = new StringBuilder();
        String str = "TEST";
        int length = 100;
        int count = 0;
        while (count < length){
            sb.append(str);
            sb.append(" ");
            count++;
        }
        System.out.println(sb);
        return sb.toString();
    }

    private static void writingLineToFile(String str){
        String nameFile = "R:\\java\\target\\classes\\practical2\\dir_file.txt";
        try ( PrintWriter pw = new PrintWriter(nameFile)){
            pw.print(str);
        } catch (FileNotFoundException e) {
            logger.fine("File not fount: " + e.getMessage());
        }
    }
}