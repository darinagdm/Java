import java.io.*;

public class CW5_2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String separator = File.separator;
        int empty = 0;

        FileReader fr = new FileReader(separator + "D:" + separator + "java"
                + separator + "CW11" + separator + "1");
        BufferedReader br = new BufferedReader(fr);
        String line;

        //part a
        while ((line = br.readLine()) != null) {
            if (line.trim().isEmpty()) {
                empty++;
            }
        }
        System.out.println("Number of empty lines: " + empty);
        
        /* part b
        String line, max_line = "";
        int max_lenght = 0;

        while ((line = br.readLine()) != null) {
            if (line.length() > max_lenght) {
                max_lenght = line.length();
                max_line = line;
            }
        }
        System.out.println("Longest line is: \n" + max_line + "\n its length: " + max_lenght);
        */
        
        fr.close();
    }
}
