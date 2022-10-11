class text {
    public text() {
        System.out.println("hello, world!");
    }

    public text(String name) {
        this();
        System.out.println(name);
    }
}

public class Cw5_3_4 {
    public static void main(String[] args) {
        text x = new text("hello");
    }
}
