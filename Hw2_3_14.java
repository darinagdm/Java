import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal div1e10 = BigDecimal.valueOf(1e10);
        BigDecimal bigDecimal = sc.nextBigDecimal();
        BigDecimal first = bigDecimal.divide(div1e10, RoundingMode.DOWN);
        BigDecimal second = bigDecimal.subtract(first.multiply(div1e10));
        System.out.println(first);
        System.out.println(second);
        System.out.println("sum = "+(first.add(second)));
    }
}
