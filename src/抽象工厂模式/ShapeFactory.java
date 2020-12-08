package 抽象工厂模式;

public  class ShapeFactory extends AbstractFactory {

    public final static String CIRCLE = "circle";
    public final static String SQUARE = "square";
    public final static String RECTANGLE = "rectangle";

    @Override
    public Color getColor(String colorType) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;

        }

        if (shapeType.equalsIgnoreCase("circle")) {

            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {

            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("square")) {

            return new Square();
        }

        return null ;
    }
}
