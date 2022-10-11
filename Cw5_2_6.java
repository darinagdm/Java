import java.util.*;
import java.lang.*;

public class Cw5_2_6 {
    static void printMatrix(int matr[][]) {
        for (int[] i : matr) {
            for (int j : i) System.out.print(j + " ");
            System.out.println();
        } System.out.println();
    }
    
    public static void norm(int m, int n, int[][] matr) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += Math.pow(matr[i][j], 2);
            }
        }
        System.out.println("Norma = " + Math.sqrt(sum));
    }
    
    public static void main(String[] args) {
        int matrix[][] = { { 100, 200 },
                           { 300, 400 }};

        printMatrix(matrix);
        norm(2, 2, matrix);
    }  
}    
