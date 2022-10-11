class text {
    String s1 = "hello";
    String s2;

    public text() {
        s2 = "hello";
    }

    void print() {
        System.out.println(s1);
        System.out.println(s2);
    }
}

public class Cw5_3_2 {
    public static void main(String[] args) {
        text x = new text();
        x.print();
    }
}
