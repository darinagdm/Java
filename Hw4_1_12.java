public class Hw4_1_12{    
    public static void main(String[] args) {    
        String str = "Hello, world!\nHow are you?\nWhat are you doing?\nBye!";    
        int count1 = 0; 
        int count2 = 1;
             
        //Counts characters except space    
        for(int i = 0; i < str.length(); i++) {    
            if((str.charAt(i) != ' ') && (str.charAt(i) != '\n')) {  
                count1++;    
            }
        }   
        
        //Counts words 
        for (int i = 0; i < str.length(); i++){
            if (((str.charAt(i) == ' ') || (str.charAt(i) == '\n')) && (str.charAt(i + 1) != ' ')){
                count2++;
            }
        } 
        
        System.out.println("String: \n" + str);
        System.out.println("\nTotal number of characters in a string: " + count1);  
        System.out.println("Total number of words in a string: " + count2);  
        System.out.println("Total number of lines in a string: " + str.lines().count());        //Counts lines  
    } 
}
