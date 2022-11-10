import java.util.Scanner;

public class Europe {
    
    public static Scanner ob = new Scanner(System.in);
    
    public String europe;
    
    public Info inform;
    
    public Europe() {
        System.out.println("Enter the name of the continent: ");
        setEurope (ob.next());
        inform = new Info();
    }
    
    public String getEurope() {
        return europe;
    }
    
    public void setEurope(String europe) {
        this.europe=europe;
    }
    
    public class Info {
        
        int pr,st,sq;
        
        public Info() {
            System.out.println("Number of countries in " +getEurope()+ " before the World War I: ");
            setPr(ob.nextInt());
            System.out.println("Number of countries in " +getEurope()+ " after the World War I: ");
            setSt(ob.nextInt());
            System.out.println("Number of countries in " +getEurope()+ " after the World War II: ");
            setSq(ob.nextInt());
        }
        
        public int getPr() {
            return pr;
        }
        
        public void setPr(int pr) {
            this.pr=pr;
        }
        
        public int getSt() {
            return st;
        }
        
        public void setSt(int st) {
            this.st=st;
        }
        
        public int getSq() {
            return sq;
        }
        
        public void setSq(int sq) {
            this.sq=sq;
        }
        
        public void print() {
            System.out.print("In "+getEurope()+" were "+getPr()+" countries before the World War I, "+getSt()+" countries after the World War I, "+getSq()+" countries after the World War II.");
        }
        
    }
    
    public static void main(String[] args) {
        Europe ct = new Europe();
        ct.inform.print();
    }
    
}
