package CW7.task_5_1;

public class Task_5_1 {
    public static void main (String[] args) {
        Text text = new Text(new String[] {"Hello, world!"});
        text.set_header(new Sentence("HEADER"));
        text.print_header();
        System.out.println(text);
    }
}
