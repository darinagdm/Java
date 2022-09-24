import java.util.Scanner;

/**
 * Represents a Cw2_2
 * @author Daria Hudemchuk
 * @version 1.0
 * @since 1.0
 */

public class Cw2_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter int 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter int 2: ");
        int num2 = input.nextInt();

        System.out.println("Розрядність числа методом логарифма : ");
        System.out.printf("Перше число: %d \n", (int)Math.log10(Math.abs(num1))+1);
        System.out.printf("Друге число: %d \n", (int)Math.log10(Math.abs(num2))+1);

        String new_num1 = Integer.toString(Math.abs(num1));
        String new_num2 = Integer.toString(Math.abs(num2));

        System.out.println("\nРозрядність числа методом рядків : ");
        System.out.println("Перше число: "+new_num1.length());
        System.out.println("Друге число: "+new_num2.length());

        double n1 = num1;
        double n2 = num2;
        n1 = 1/n1;
        n2 = 1/n2;

        System.out.printf("\nСереднє гармонічне: %.02f", 2/(n1+n2));
    }
}
