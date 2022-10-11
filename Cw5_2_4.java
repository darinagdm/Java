public class Cw5_2_4 {
    static int cw(int[][] matr) {
        int sum = 0, temp = 0, sign;
        boolean bool = false;

        for (int[] row : matr) {
            for (int i : row) {
                sign = Integer.signum(i);
                if (sign == -1 && bool) temp += i;
                else if (sign == 1 || sign == 0) {
                    if (bool) {
                        bool = false;
                        break;
                    } else bool = true;
                }
            }
            
            if (bool) bool = false;
            else sum += temp;
            temp = 0;
        }
        return sum;
    }


    public static void main(String[] args) {
        int[][] matrix = {  { 3, -2, -1,  4 },
                            { -1,  9, -9,  9 },
                            { 5, -7, -5, -8 },
                            { 2,  6,  2, -6 } };

        System.out.println("Sum = " + cw(matrix));
    }
}
