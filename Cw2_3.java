import java.util.Scanner;

/**
 * Represents a Cw2_3
 * @author Daria Hudemchuk
 * @version 1.0
 * @since 1.0
 */

public class Cw2_3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Уведіть два числа: ");
        Double[] nums = new Double[2];
        
        for(int i=0; i<2; i++){
            nums[i] = in.nextDouble();
        }

        double geom_mean = Math.pow((Math.abs(nums[0]*nums[1])), 0.5);
        System.out.println("Середнє геометричне: "+geom_mean);
        System.out.printf("Середнє геометричне в науковому представленні: :%e", geom_mean);
    }
}
