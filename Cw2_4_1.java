import java.util.HashMap;
import java.util.Scanner;

class Cw2_4_1{
    static String fractionToDecimal(int n, int d){
        String r = "";
        HashMap<Integer, Integer> m = new HashMap<>();
        m.clear();
        int x = n % d;
        
        while ((x != 0) && (!m.containsKey(x))){
            m.put(x, r.length());
            x *= 10;
            int y = x / d;
            r += String.valueOf(y);
            x %= d;
        }
        if (x == 0){
            return "";
        }
        else if(m.containsKey(x)){
            return r.substring(m.get(x));
        }
        return "";
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input p: ");
        int p = sc.nextInt();
        System.out.println("Input q: ");
        int q = sc.nextInt();
        
        String r = fractionToDecimal(p, q);
        int whole = (int) p/q;
        double repr = (double) p/q;
        
        if (r == ""){
            System.out.print(whole);
        }
        else{
            String t = Double.toString(repr);
            int before_repeat = t.indexOf(r);
            int point = t.indexOf('.');
            String last_part = t.substring(point+1,before_repeat);
            System.out.print(whole+"."+last_part+"("+r+")");
        }
    }
}
