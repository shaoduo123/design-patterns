package 工厂模式;

public class FactoryPatternDemo {

    public static void main(String args[]) {

        ShapeFactory  shapeFactory = new ShapeFactory() ;
        Shape shape = shapeFactory.getShape("circle") ;

        shape.draw();

    }
}
