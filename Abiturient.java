import java.util.Arrays;

public class Abiturient {
    private int id;
    private String name;
    private String surname;
    private String middle_name;
    private String address;
    private String phone_number;
    private int[] evaluation;
    private int evaluation_sum=0;

    public Abiturient() {
        this.id = 0;
        this.name = "";
        this.surname = "";
        this.middle_name = "";
        this.address = "";
        this.phone_number = "";
        this.evaluation = new int[0];
        evaluation_sum = 0;
    }

    public Abiturient(int id, String name, String middle_name, String surname, String address, String phone_number, int[] evaluation) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middle_name = middle_name;
        this.address = address;
        this.phone_number = phone_number;
        this.evaluation = evaluation;
        for (int i : evaluation) {
            evaluation_sum+=i;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int[] getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int[] evaluation) {
        this.evaluation = evaluation;
    }

    public int getEvaluation_sum() {
        return evaluation_sum;
    }

    public void setEvaluation_sum(int evaluation_sum) {
        if(evaluation_sum>=0) {
            this.evaluation_sum = evaluation_sum;
        } else System.out.println("Сума оцінок не може бути менше 0.");
    }

    @Override
    public String toString() {
        return "Абітурієнт - " +
                "id=" + id +
                ", Прізвище=" + surname+
                ", Ім'я=" + name  +
                ", По-батькові=" + middle_name  +
                ", Адрес=" + address  +
                ", Номер телефону=" + phone_number  +
                ", Оцінки=" + Arrays.toString(evaluation) +
                ", Сума оцінок=" + evaluation_sum;
    }
}
