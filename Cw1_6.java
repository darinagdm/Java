public class Cw1_6 {
    public static void main(String args[]) {
        double x = 0;
        for(String arg: args){
            x += Double.parseDouble(arg);
        }

        System.out.println("Sum: "+x);
        System.out.println("Number: "+args.length);
    }
}
