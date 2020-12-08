package 抽象工厂模式;

public class Main {
    public static void main(String [] args) {
        AbstractFactory colorFactory = FactoryProducer.getFactory("color") ;
        Color color = colorFactory.getColor("red");

        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape") ;
        Shape shape = shapeFactory.getShape("circle") ;

        color.fill();
        shape.draw();
    }
}
