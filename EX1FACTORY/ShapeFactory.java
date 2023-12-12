package EX1FACTORY;

public class ShapeFactory {

    public static Shape getShape(ShapeType type){
        Shape shape = switch (type){
            case CERCHIO -> new Cerchio();
            case RETTANGOLO -> new Rettangolo();
        };

        return shape;
    }
}
