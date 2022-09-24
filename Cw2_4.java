import java.util.Scanner;

/**
 * Represents a Cw2_4
 * @author Daria Hudemchuk
 * @version 1.0
 * @since 1.0
 */

public class Cw2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть число градусів Цельсія С : ");
        int a = sc.nextInt();
        System.out.printf("F = %.1f%n", (9*(float)a/5+32));
    }
}