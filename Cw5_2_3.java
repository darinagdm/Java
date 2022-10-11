import java.util.Arrays;

public  class Cw5_2_3 {
    static void printMatrix(int matr[][]) {
        for(int[] i : matr){
            for(int j : i){
                System.out.print(j+"  ");
            }  System.out.println();
        }
    }
    
    public static void inDecrease(int[][] b) {
        int[] f = new int[b.length * b.length];
        int c = 0; int r = 0; int max = 0; int h = 0; int m = 0; int min = 0; int h1 = 0;
        
        for(int[] i : b){
            for(int j : i){
                f[c++] = j;
            }
        }
        for (int g = 0; g < f.length - 1; g++){
            if(f[g] < f[g+1]){
                r += 1;
                
                if(r > max){
                    max = r; 
                    h = g+1;
                }
            }
            else{
                r = 0;
            }
            if(f[g] > f[g+1]){
                m += 1;
                if(m > min){
                    min = m;
                    h1 = g + 1;
                }
            } 
            else{
                m=0;
            }
        }
        
        System.out.println("\nGrowth:");
        int[]l=new int[max+1];
        System.arraycopy(f,(h-max),l,0,(max+1));
        System.out.println(Arrays.toString(l)+" "+(max+1));
        System.out.println("\nDecrease:");
        int[]t=new int[min+1];
        System.arraycopy(f,(h1-min),t,0,(min+1));
        System.out.println(Arrays.toString(t)+" "+(min+1));
    }
    
    public static void main(String[] args) {
        int matrix[][] = { { 39, 27, 11, 42 },
                           { 10, 93, 91, 90 },
                           { 54, 78, 56, 89 },
                           { 24, 64, 20, 65 } };
        printMatrix(matrix);
        inDecrease(matrix);
    }
}
