import java.util.Scanner;

/**
 * Represents a Hw3_9
 * @author Daria Hudemchuk
 * @version 1.0
 * @since 1.0
 */

public class Hw3_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of the first number: ");
        double a = sc.nextInt();
        System.out.println("Enter the value of the second number:");
        double b = sc.nextInt();

        double diff = a - b;
        double pro = a * b;

        System.out.println(diff);
        System.out.println(pro);
    }
}
