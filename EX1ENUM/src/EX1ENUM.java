public class EX1ENUM {
    public static void main (String[] args) {

        Rettangolo rettangolo = new Rettangolo(5,6, TipoForma.RETTANGOLO);
        Triangolo triangolo = new Triangolo(7 , 8, TipoForma.TRIANGOLO);
        System.out.println(rettangolo.calcolaArea());
        System.out.println(triangolo.calcolaArea());
    }
}
