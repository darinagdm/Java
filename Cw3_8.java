import java.util.Scanner;

public class Cw3_8 {
    public static void main(String[] args) {
        double a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        double f = a%1;
        double p;

        if(a > 0){
            p = a - f;
        }
        else{
            p = a - f - 1;
        }

        System.out.printf("Whole part = %f \n", p);
        System.out.printf("Fraction part = %f \n", f);
        System.out.printf("Floor = %f \n", Math.floor(a));
        System.out.printf("Ceil = %f \n", Math.ceil(a));
        System.out.printf("Round = %d \n", Math.round(a));
    }
}
