/** Represents a Cw1_8
 * @author Daria Hudemchuk
 * @version 1.0
 * @since 1.0
 */

public class Cw1_8 {
    /**
     * The username input from command line
     */
    private String username;
    public static void main(String args[]){
        Cw1_8 obj = new Cw1_8();

        if(args.length<1){
            System.out.println("Incorrect number of arguments");
        }

        else{
            obj.username = args[0];
            System.out.println(obj.username);
        }
    }
}
