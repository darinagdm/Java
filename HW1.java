public class HW1 {
    public static void main(String[] args) {
        String str = "Hello, world! How are you? What are you doing?";
        String[] words = str.split("\\?|\\,|\\!");
        
        for (String word : words) {
            String[] s = word.split("(?<=\\G.{"+6+"})");
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
            }
        }
    }
}
