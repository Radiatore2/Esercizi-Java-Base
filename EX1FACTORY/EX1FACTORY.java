package EX1FACTORY;

public class EX1FACTORY {

    public static void main(String[] args) {

        Shape cerchio = ShapeFactory.getShape(ShapeType.RETTANGOLO);
        Shape rettangolo = ShapeFactory.getShape(ShapeType.CERCHIO);

        cerchio.draw();
        rettangolo.draw();
    }
}
