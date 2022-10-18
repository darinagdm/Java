import java.util.*;

public class Cw2_1 {
    static Scanner console = new Scanner(System.in);
    static void print_faculty(Student[] st, String faculty) {
        System.out.printf("Students from %s faculty:\n", faculty);
        for(Student s: st){
            if(Objects.equals(s.get_faculty(), faculty)){
                s.show();
            }
        }
    }

    static void get_students_faculty_course(Student[] st, String faculty, int course) {
        System.out.printf("Students from %s faculty and %d course:\n", faculty, course );
        for(Student s: st) {
            if(Objects.equals(s.get_faculty(), faculty) && s.get_course() == course) {
                s.show();
            }
        }
    }

    static void get_year(Student[] st, String date){
        System.out.printf("Students with birth date %s:\n", date);
        for(Student s: st){
            if(Objects.equals(s.get_date(), date)){
                s.show();
            }
        }
    }

    public static void main(String[] args) {
        int N = 3;
        Student[] mas = new Student[N];

        for(int i = 0; i < N; i++){
            mas[i] = new Student();
            mas[i].input(console);
        }

        String f = console.nextLine();
        print_faculty(mas, "mechmat");
        get_students_faculty_course(mas, "mechmat",  3);
        get_year(mas, "27 10 2002");
    }
}
