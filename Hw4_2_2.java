import java.util.Scanner;

/**
 * Represents a Hw4_2_2
 * @author Daria Hudemchuk
 * @version 1.0
 * @since 1.0
 */

public class Hw4_2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y:");
        int y = sc.nextInt();

        int z = (int) (Math.pow(x, 2) * Math.pow(y, 2) + Math.pow(x, 3) * Math.pow(y, 3) + Math.pow(x, 4) * Math.pow(y, 4));
        System.out.println("Result: "+z);
    }
}
