import java.util.Scanner;

/**
 * Represents a Hw4_2_1
 * @author Daria Hudemchuk
 * @version 1.0
 * @since 1.0
 */

public class Hw4_2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y:");
        int y = sc.nextInt();

        int z = (int) (Math.pow(x, 3) + 3 * Math.pow(x, 2) * y + 3 * x * Math.pow(y, 2) + Math.pow(y, 3));
        System.out.println("Result: "+z);
    }
}
