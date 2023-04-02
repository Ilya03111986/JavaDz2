
// //Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
// //Требуется перехватить все возможные ошибки и вывести их в логгер.
// //
// //После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате
// public static void main(String[] args) {

// }

// public String findJewelsInStones(String jewels, String stones){

//     return "";
// }
// }
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DZ2_3  {
    private static final Logger logger = Logger.getLogger(DZ2_3.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число типа byte: ");
        byte number = scanner.nextByte();
        scanner.close();
        try {
            FileWriter writer = new FileWriter("result.txt");
            writer.write(Byte.toString(number));
            writer.close();
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Ошибка при записи в файл", e);
        }
    }
}
