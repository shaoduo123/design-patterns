package 工厂模式;

public class ShapeFactory {

    public static final String  CIRCLE = "circle" ;
    public static final String  SQUARE = "square" ;
    public static final String  RECTANGLE ="rectangle" ;


    public Shape getShape(String shapeType){

        if(shapeType == null ) {
            return null ;
        }
        if(shapeType == ShapeFactory.RECTANGLE){

            return new Rectangle() ;
        }else if(shapeType == ShapeFactory.SQUARE){
            return new Square() ;

        }else if(shapeType == ShapeFactory.CIRCLE)  {

            return new Circle() ;
        }

        return null;
    }

}
