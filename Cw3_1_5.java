import java.util.Scanner;

public class Cw3_1_5 {
    public static double dist(double[] point1, double[] point2){
        double p = Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2) + Math.pow(point1[2] - point2[2], 2);
        double dist = Math.sqrt(p);
        return dist;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] point1 = new double[3];
        System.out.println("Input coordinates of the 1 point: ");
        
        for(int i=0; i<3; ++i){
            point1[i] = sc.nextDouble();
        }
        
        System.out.println("Input the number of other points: ");
        int n = sc.nextInt();
        double[][] points = new double[n][3];
        System.out.println("Input coordinates of other point: ");
        
        for(int j=0; j<n; ++j){
            System.out.printf("Point #%d: ", j);
            for(int i=0; i<3; ++i){
                points[j][i] = sc.nextDouble();
            }
        }
        
        double md = dist(point1, points[0]);
        double[] cl = points[0];
        
        for(int j=1; j<points.length; ++j){
            if(dist(point1, points[j]) < md){
                md = dist(point1, points[j]);
                cl = points[j];
            }
        }
        
        System.out.printf("The closest point: (%.3f, %.3f, %.3f), distance = %.3f", cl[0], cl[1], cl[2], md);
    }
}
