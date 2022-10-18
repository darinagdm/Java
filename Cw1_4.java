class Cw1_4_1{
    protected  int a = 10;
}

public class Cw1_4 extends  Cw1_4_1{
    static int b = 5;
    Cw1_4(){
        b += super.a;
    }
    public void getName(){
        System.out.println(b);
    };

    public static   void main(String[] args){
        Cw1_4 temp = new Cw1_4();
        temp.getName();
    }
}
