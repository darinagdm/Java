import CW7.task_4_1.RationalNumber;

public class task4_1 {
    public static void main(String[] args) {
        RationalNumber[] mass = { new RationalNumber(1, 2), new RationalNumber(2, 3), new RationalNumber(3, 4) };
        RationalNumber res = mass[0];

        for (RationalNumber r : mass) System.out.println(r);
        for (int i = 1; i < mass.length; i++) res = res.add(mass[i]);

        System.out.println(res);
    }
}
