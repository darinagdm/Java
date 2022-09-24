/**
 * Represents a Hw2_6
 * @author Daria Hudemchuk
 * @version 1.0
 * @since 1.0
 */

public class Hw2_6 {
    public static void main(String[] args) {
        int a = 0;
        int b = 250;

        System.out.print("Без переходу на новий рядок: \n");
        for (int i = 0; i < 10; i++) {
            int random_number1 = a + (int) (Math.random() * b);
            System.out.print(" " + random_number1);
        }

        System.out.print("\nЗ переходом на новий рядок: \n");
        for (int i = 0; i < 10; i++) {
            int random_number1 = a + (int) (Math.random() * b);
            System.out.println(" " + random_number1);
        }
    }
}
