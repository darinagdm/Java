import java.util.Scanner;

public class Hw3_2_9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input m: ");
        long m = scanner.nextInt();
        System.out.print("Input k: ");
        byte k = scanner.nextByte();
        long rest = 0;
        for (int i = 0; i < k; i++) {
        rest = m % 10;
        m = m / 10;
        System.out.println(m); 
        System.out.println(rest);
    }
    System.out.printf("Your number: %d \n", rest);
  }
}
