public class Cw2_2_2 {
    public static void main(String[] args){
        int num1 = -12;
        int num2 = num1;
        if(num1 > 0){
            System.out.println("Signed right shift");
            while(num1 != 0){
                num1 = num1 >> 1;
                System.out.println("Number = "+ num1 + " binary = "+ Integer.toBinaryString(num1));
            }
            System.out.println("Left shift + unsigned right shift");
            num2 = num2 << 1;
            System.out.println("Number = "+ num2 + " binary = "+ Integer.toBinaryString(num2));
            while ((num2 != 0)) {
                num2 = num2 >>> 1;
                System.out.println("Number = " + num2 + " binary = " + Integer.toBinaryString(num2));
            }
        }
        else{
            System.out.println("Signed right shift");
            while(⁓num1 != 0){
                num1 = num1 >> 1;
                System.out.println("Number = "+ num1 + " binary = "+ Integer.toBinaryString(num1));
            }
            System.out.println("Left shift + unsigned right shift");
            num2 = num2 << 1;
            System.out.println("Number = "+ num2 + " binary = "+ Integer.toBinaryString(num2));
            while ((num2 != 0)) {
                num2 = num2 >>> 1;
                System.out.println("Number = " + num2 + " binary = " + Integer.toBinaryString(num2));
            }
        }
    }
}
