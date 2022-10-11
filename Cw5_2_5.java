public class Cw5_2_5 {
    static void printMatrix(int matr[][]) {
        for (int[] i : matr) {
            for (int j : i) System.out.print(j + " ");
            System.out.println();
        } System.out.println();
    }

    static int[][] cw(int matr[][]) {
        int n = matr.length;
        int x = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i < j){
                    x = matr[i][j];
                    matr[i][j] = matr[j][i];
                    matr[j][i] = x;
                }
            }
        }
        return matr;
    }
    public static void main(String[] args) {
        int matrix[][] = { { 39, 27, 11, 42 },
                           { 10, 93, 91, 90 },
                           { 54, 78, 56, 89 },
                           { 24, 64, 20, 65 } };

        printMatrix(cw(matrix));
    }  
}
