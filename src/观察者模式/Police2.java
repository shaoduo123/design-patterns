package 观察者模式;

public class Police2 extends Observer{
    private String policeName ;

    //实际继承了父类的suspect
    public Police2(String policeName, AbstractSuspect suspect) {
        this.policeName = policeName ;
        this.suspect = suspect ;
        this.suspect.attach(this) ; //将嫌犯增加进去
    }

    @Override
    public void update() {
        System.out.println("警察 "+policeName+"正在监视"+" 嫌疑犯"+"");
    }
}
