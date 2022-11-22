import java.io.*;
import java.util.*;

public class CW6_1{
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        Scanner textFile = new Scanner(new File(separator + "D:" + separator + "java"
                + separator + "CW11" + separator + "3"));
        FileWriter fw = new FileWriter(separator + "D:" + separator + "java"
                + separator + "CW11" + separator + "4");

        int sum = 0, count = 0;
        System.out.println("All numbers in text file :");
        while (textFile.hasNextInt()) {
            int nextInt = textFile.nextInt();
            count += 1;
            System.out.println(count + ". " +nextInt);
            sum += nextInt;
            fw.write(nextInt + " ");
        }
        System.out.println("\nTheir sum = " + sum);
        fw.close();
    }
}
