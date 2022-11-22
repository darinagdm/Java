import java.io.*;

public class CW5_1_cd {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String separator = File.separator;

        FileReader fr = new FileReader(separator + "D:" + separator + "java"
                + separator + "CW11" + separator + "1");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(separator + "D:" + separator + "java"
                + separator + "CW11" + separator + "2");
        String line;

        //part c
        while((line = br.readLine()) != null) {
            line = line.replaceAll("\\b[\\w']{1}\\b", "").replaceAll("\\s+", " ").trim();
            line=line.replaceAll("\\s+", " ");
            System.out.println(line);
            fw.write(line);
        }
        
        /* pard d
        FileWriter fw = new FileWriter(separator + "D:" + separator + "java"
                + separator + "CW11" + separator + "5");
        while((line = br.readLine()) != null) {
            line = line.replaceAll("\\s+", " ").trim();
            line=line.replaceAll("\\s+", " ");
            System.out.println(line);
            fw.write(line + "\n");
        }
        */
        
        fr.close();
        fw.close();

    }

}