public class Rettangolo extends Forma {

    int b;
    int h;

    public Rettangolo (int b, int h){
        this.b = b;
        this.h = h;
    }
    public void calcolaArea(){
        int a = b * h;
        System.out.print("L'area è " + a);
    }
}
