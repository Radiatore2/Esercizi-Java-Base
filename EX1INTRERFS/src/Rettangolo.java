public class Rettangolo implements Forma {
    private int b;
    private int h;

    public Rettangolo(int b, int h) {
        this.b = b;
        this.h = h;
    }

    public int calcolaArea() {
        return (b * h / 2);
    }
}
