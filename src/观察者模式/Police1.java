package 观察者模式;

public class Police1 extends Observer{
    //继承实现了 protect 变量
    private  String policeName ;
    // ...一些警察的内容

    public Police1(String policeName, AbstractSuspect suspect) {
        this.policeName = policeName ;
        this.suspect = suspect ;
        this.suspect.attach(this) ; //将嫌犯增加进去
    }


    @Override
    public void update() {
        System.out.println("警察 "+policeName+"正在监视"+" 嫌疑犯"+"");
    }
}
