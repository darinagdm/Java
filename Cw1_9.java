package Cw1_9;

/**
 * Represents a Cw1_9
 * <strong>This is my HTML header</strong>
 * @author Daria Hudemchuk
 * @version 1.0
 * @since 1.0
 */

public class Cw1_9 {
    /**
     * The username input from command line
     */
    private String username;
    public static void main(String args[]){
        Cw1_9 obj = new Cw1_9();

        if(args.length<1){
            System.out.println("Incorrect number of arguments");
        }

        else{
            obj.username = args[0];
            System.out.println(obj.username);
        }
    }
}
