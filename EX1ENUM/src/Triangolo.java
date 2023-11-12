public class Triangolo {
    private int b;
    private int h;

    private TipoForma type;

    public Triangolo(int b, int h, TipoForma type) {
        this.b = b;
        this.h = h;
        this.type = type;
    }

    public TipoForma getType() {
        return type;
    }

    public int calcolaArea() {
        return (b * h / 2);
    }
}
