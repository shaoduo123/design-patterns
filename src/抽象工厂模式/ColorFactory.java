package 抽象工厂模式;

public class ColorFactory extends AbstractFactory {
    public final static String BLUE = "blue" ;
    public final static String RED  = "red" ;
    public final static String GREEN = "green" ;

    @Override
    public Color getColor(String colorType) {
        if(colorType  == null )
            return null ;
        if(colorType.equalsIgnoreCase(ColorFactory.BLUE)){
            return new Blue();
        } else if(colorType.equalsIgnoreCase(ColorFactory.GREEN)){
            return new Green() ;
        }else if(colorType.equalsIgnoreCase(ColorFactory.RED)){
            return new Red();
        }

        return null ;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
