package 抽象工厂模式;

public class FactoryProducer {

    public final static String SHAPE = "shape" ;
    public final static String COLOR = "color" ;

    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase(FactoryProducer.COLOR)){
            return new ColorFactory() ;
        }else if(choice.equalsIgnoreCase(FactoryProducer.SHAPE))
        {
            return new ShapeFactory();
        }
        return null ;
    }
}
