import java.util.*;
import java.lang.*;

public class Cw5_2_7 {
    public static void printMatrix(String title, int[][] matr) {
        System.out.println(title);
        for (int[] i : matr) {
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
    
    public static int[][] rotateMatrix(int m, int n, int[][] matr) {
        int[][] rotated = new int[n][m];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                rotated[j][i] = matr[i][n - j - 1];
            }
        return rotated;
    }
    
    public static void main(String[] args) {
        int matrix[][] = { { 39, 27, 11, 42 },
                           { 10, 93, 91, 90 },
                           { 54, 78, 56, 89 },
                           { 24, 64, 20, 65 } };
                           
        printMatrix("Original matrix", matrix);
        printMatrix("\nRotated matrix : ", rotateMatrix(4, 4, matrix));
    }  
}
