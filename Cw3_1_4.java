import java.util.Scanner;

class Cw3_1_4 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scan.nextInt();
        String mas[] = new String[n];
        
        for(int i=0; i<n; i++){
            mas[i] = new String("value" + i + "\n");
        }
        
        for(String x : mas){
           System.out.println(x); 
        }
        
        System.out.println("Input line: ");
        String line0 = scan.nextLine();
        String line = scan.nextLine();
        
        String[] parsed = line.split(" ");
        
        int Max = Integer.parseInt(parsed[0]);
        
        int maxInRow = Max;
        int countInRow = 1;
        int maxCount = 1;
        int prev = Integer.MIN_VALUE;
        
        for(String p: parsed){
            System.out.println("p" + p);
            int val = Integer.valueOf(p);
            if(val>Max){
                Max = val;
            }
        
            //1.4
            if(val==prev){
                countInRow++;
            }
            else{
                if(countInRow>maxCount){
                    maxCount = countInRow;
                    maxInRow = prev;
                }
            
                countInRow = 1;
                prev = val;
            }
        }
        
        System.out.println("Max" + Max);
        
        System.out.println("Max in sequence" + maxInRow + " is " + " times here");
    }
}
