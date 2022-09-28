import java.util.Scanner;

public class Hw3_3_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 6 scores: ");
        Double[] nums = new Double[6];
        for(int i=0; i<6; i++){
            nums[i] = in.nextDouble();
        }
        
        double min = nums[0] + 1;
        double max = nums[0] + 1;
        for(int i=0; i<6; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        
        double aver = (nums[0] + nums[1] + nums[2] + nums[3] + nums[4] + nums[5] - min - max) / 4;
        System.out.println("Average: "+aver);
    }
}
