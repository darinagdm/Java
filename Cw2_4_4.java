import java.util.Scanner;

public class Cw2_4_4 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = sc.nextInt();
        int c = 0;
        for(int i = 10; i < 100; ++i){
            if(c == n){
                c = 0;
                System.out.println();
            }
            System.out.printf("%d ", i);
            c++;
        }
    }
}
