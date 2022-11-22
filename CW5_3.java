import java.io.*;

public class CW5_3{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String separator = File.separator;
        Scanner sc = new Scanner(System.in);

        FileReader fr = new FileReader(separator + "D:" + separator + "java"
                + separator + "CW11" + separator + "1");
        BufferedReader br = new BufferedReader(fr);
        String line;

        //part a
        while((line = br.readLine()) != null) {
            System.out.println(line);
        }
        
        /* part b
        boolean noone = true   ;
        while((line = br.readLine()) != null) {
            if(line.length() > 60){
                System.out.println(line);
                noone = false;
            }
        }
        if (noone){
            System.out.println("There is no one string with more than 60 symbols");
        }
        */
        
        /* part c
        int count = 0;
        System.out.print("Enter one symbol: " );
        String start = sc.nextLine();
        System.out.println("Lines, which begin with: " + start );
        while((line = br.readLine()) != null) {
            if(line.startsWith(start)){
                System.out.println(line);
                count += 1;
            }
        }
        if(count == 0){
            System.out.println("There are no one line, which begin with " + start);
        }
        else {
            System.out.println("There are " + count + " lines, which begin with " + start);
        }
        */
        
        /* pard d
        System.out.print("Enter one symbol: " );
        String finish = sc.nextLine();
        System.out.println("Lines, which ends with: " + finish );
        while((line = br.readLine()) != null) {
            if(line.endsWith(finish)){
                System.out.println(line);
                count += 1;
            }
        }
        if(count == 0){
            System.out.println("There are eno one line, which ends with " + finish);
        }
        else {
            System.out.println("There are " + count + " lines, which ends with " + finish);
        }
        */
        
        /* part e
        while((line = br.readLine()) != null) {
            if(!line.isEmpty()){
                if(line.charAt(0) == line.charAt(line.length() - 1)){
                    System.out.println(line);
                    count += 1;
                }
            }
        }
        if(count == 0){
            System.out.println("There are no one line, which begin and ends with ");
        }
        else {
            System.out.println("There are " + count + " lines, which begin and ends with the same symbol");
        }
        */
        
        /* part f
        while((line = br.readLine()) != null) {
            if(!line.isEmpty()){
                boolean equal = true;
                for (int i = 0; i < line.length(); i++ ){
                    if (line.charAt(0) != line.charAt(i)){
                        equal = false;
                    }

                }
                if (equal){
                    System.out.println(line);
                    count += 1;
                }
            }
        }
        System.out.println("There are " + count + " lines with equals symbols");
        */
        
    fr.close();
    }
}
