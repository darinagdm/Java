import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Abiturient[] abiturients_list(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Уведіть кількість абітурієнтів: ");
        Abiturient[] abiturients = new Abiturient[scanner1.nextInt()];
        for (int i=0; i<abiturients.length; i++) {
            abiturients[i]=new Abiturient();
            System.out.println();
            System.out.print("Уведіть id: ");
            abiturients[i].setId(scanner1.nextInt());
            System.out.print("Уведіть прізвище: ");
            abiturients[i].setSurname(scanner1.next());
            System.out.print("Уведіть ім'я: ");
            abiturients[i].setName(scanner1.next());
            System.out.print("Уведіть по-батькові: ");
            abiturients[i].setMiddle_name(scanner1.next());
            System.out.print("Уведіть адресу: ");
            abiturients[i].setAddress(scanner1.next());
            System.out.print("Уведіть номер телефону: ");
            abiturients[i].setPhone_number(scanner1.next());
            System.out.print("Уведіть кількість оцінок: ");
            int summa=0,n=scanner1.nextInt();
            int[] mass=new int[n];
            for (int j=0; j<n;j++){
                System.out.print("Уведіть оцінку номер " + (j+1) + ": ");
                mass[j]=scanner1.nextInt();
            }
            abiturients[i].setEvaluation(mass);
            for (int mas : mass) {
                summa+=mas;
            }
            abiturients[i].setEvaluation_sum(summa);
        }
        return abiturients;
    }

    static Abiturient[] abit(){
        Abiturient[] abiturients = new Abiturient[3];
        int[] mass = {1,2,3,4,3};
        abiturients[0] = new Abiturient(0,"Й","Ц","У","К 14","0965423571",mass);
        mass = new int[]{4, 5, 5, 4, 5};
        abiturients[1] = new Abiturient(1,"Ф","І","В","К 56","066452351",mass);
        mass = new int[]{2, 3, 4, 3, 2};
        abiturients[2] = new Abiturient(2,"Я","Ч","С","К 25","099541235",mass);

        return abiturients;
    }

    static void abiturient_check_bad_evaluation(Abiturient[] abiturients){
        for (Abiturient abiturient : abiturients) {
            for (int i : abiturient.getEvaluation()) {
                if(i<3) {
                    System.out.println(abiturient.toString());
                    break;
                }
            }
        }
        System.out.println();
    }

    static void abiturient_check_evaluation_sum(Abiturient[] abiturients,int summa){
        for (Abiturient abiturient : abiturients) {
            if (abiturient.getEvaluation_sum()>summa)
                System.out.println(abiturient.toString());
        }
        System.out.println();
    }

    static void abiturient_check_evaluation(Abiturient[] abiturients, int n,int b){
        for (int i =0; i<abiturients.length;i++) {
            for (int j = i; j < abiturients.length; j++) {
                if(abiturients[i].getEvaluation_sum()<abiturients[j].getEvaluation_sum()){
                    Abiturient abiturient = abiturients[j];
                    abiturients[j] = abiturients[i];
                    abiturients[i] = abiturient;
                }
            }
        }
        System.out.println();
        System.out.println("1)Список із n-абітурієнтів, які мають найвищу суму балів:");
        for (int i=0; i<n; i++) {
            System.out.println(abiturients[i].toString());
        }
        System.out.println();

        System.out.println("2)Список абітурієнтів, які мають півпрохідну суму:");
        for (Abiturient abiturient : abiturients) {
            if(abiturient.getEvaluation_sum()>b)
                System.out.println(abiturient.toString());
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Abiturient[] abiturients_list = abiturients_list();           
        // Abiturient[] abiturients_list=abit();                      
        System.out.println("a)Вивести список абітурієнтів, які мають незадовільні оцінки (2 и 1).");
        abiturient_check_bad_evaluation(abiturients_list);

        System.out.println("b)Вивести список абітурієнтів, у яких сума балів вище заданої.");
        System.out.print("Уведіть сумму балов: ");
        abiturient_check_evaluation_sum(abiturients_list,scanner.nextInt());

        System.out.println("");

        System.out.println("c)Вибрати задану кількість n-абітурієнтів, які мають найвищу суму балів (вивести також повний список абітурієнтів, у яких півпрохідна сума).");
        System.out.print("Введіть кількість абітурієнтів(n): ");
        int n = scanner.nextInt();
        System.out.print("Введіть півпрохідну суму: ");
        abiturient_check_evaluation(abiturients_list,n,scanner.nextInt());
    }

}
