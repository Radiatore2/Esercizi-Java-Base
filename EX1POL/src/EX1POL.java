public class EX1POL {
    public static void main (String[] args) {

        Rettangolo rettangolo = new Rettangolo(5,6);
        Triangolo triangolo = new Triangolo(7 , 8);

        System.out.println(rettangolo.calcolaArea());
        System.out.println(triangolo.calcolaArea());
    }
}
