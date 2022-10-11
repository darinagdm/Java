import java.util.Objects;

public class Cw5_2_2 {
    static void printMatrix(int[][] matr) {
        for (int[] i : matr) {
            for (int j : i) System.out.print(j + " ");
            System.out.println();
        } System.out.println();
    }

    static int[][] task2_2(int[][] matr, int k, String direction) {
        int n = matr.length;
        k = k % n;
        int[][] new_matr = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (Objects.equals(direction, "up")) new_matr[i][j] = matr[(i + k) % n][j];
                if (Objects.equals(direction, "down")) new_matr[i][j] = matr[(i + n - k) % n][j];
                if (Objects.equals(direction, "right")) new_matr[i][j] = matr[i][(j + n - k) % n];
                if (Objects.equals(direction, "left")) new_matr[i][j] = matr[i][(j + k) % n];
            }

        return new_matr;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {  { 39, 27, 11, 42 },
                            { 10, 93, 91, 90 },
                            { 54, 78, 56, 89 },
                            { 24, 64, 20, 65 } };
        printMatrix(matrix);
        printMatrix(task2_2(matrix, 1, "up"));
        printMatrix(task2_2(matrix, 1, "down"));
        printMatrix(task2_2(matrix, 1, "right"));
        printMatrix(task2_2(matrix, 1, "left"));
    }
}
