public class Cw5_2_1 {
    static void printMatrix(int matr[][]) {
        for (int[] i : matr) {
            for (int j : i) System.out.print(j + " ");
            System.out.println();
        } System.out.println();
    }

    static int[][] task21(int matr[][], int k) {
        int n = matr.length;
        int[][] res = matr.clone();
        k--;

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (res[j][k] > res[j + 1][k]) {
                    int[] temp = res[j];
                    res[j] = res[j + 1];
                    res[j + 1] = temp;
                }
        return res;
    }
    public static void main(String[] args) {
        int matrix[][] = { { 39, 27, 11, 42 },
                           { 10, 93, 91, 90 },
                           { 54, 78, 56, 89 },
                           { 24, 64, 20, 65 } };

        printMatrix(task21(matrix, 3));
    }  
}
