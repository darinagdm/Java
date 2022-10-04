import java.util.Scanner;

public class Cw3_1_3 {
    static Scanner scan = new Scanner(System.in);
    public static double avg(double[] mas){
        if(mas.length==0) return 0;
        double res = 0;
        for(double x:mas){
            res += x;
        }
        return res/mas.length;
    }
        
    public static double dev(double[] mas){
        if(mas.length==0) return 0;
        double res = 0;
        double ser = avg(mas);
        for(double x:mas){
            res += (x-ser)*(x-ser);
        }
        return Math.sqrt(res/mas.length);
    }
        
    public static void main(String[] args){
        int n = scan.nextInt();
        double mas[] = new double[n];
        for(int i=0; i<n; i++){
            mas[i] = scan.nextDouble();
        }
        System.out.println("Avg = "+ avg(mas));
        System.out.println("Dev = "+ dev(mas));
    }
}
