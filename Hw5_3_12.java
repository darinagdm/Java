class message {
    protected void finalize() {
        System.out.println("Hello, world!");
    }
}

class Hw5_3_12 {
    public static void main(String[] args) {
        message x = new message();
        x.finalize();
    }
}
