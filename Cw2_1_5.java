public class Cw2_1_5 {
    String us;
    float x;
    Cw2_1_5(String username, float x){
        this.us = us;
        this.x = x;
    }
    public static void main(String[] args){
        Cw2_1_5 object = new Cw2_1_5("Daria", 151.512f);
        object.display();
    }

    public void display(){
        System.out.println("The nickname: "+this.us);
    }
}
