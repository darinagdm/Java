public class Cw1_7 {
    private String username;
    public static void main(String args[]) {
        Cw1_7 obj = new Cw1_7();

        if(args.length < 1){
            System.out.println("Incorrect number of arguments");
        }

        else{
            obj.username = args[0];
            System.out.println(obj.username);
        }
    }
}
