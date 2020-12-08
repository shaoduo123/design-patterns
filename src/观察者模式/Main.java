package 观察者模式;

public class Main {
    public static void main(String args[]){
        AbstractSuspect suspect1 = new AbstractSuspect();
        AbstractSuspect suspect2 = new AbstractSuspect();
        AbstractSuspect suspect3= new AbstractSuspect();
        Observer police1 = new Police1("张警官",suspect1) ;
        Observer police2 = new Police2("李警官",suspect2) ;
        System.out.println("犯罪嫌疑人变化");
        suspect2.setSuspenctName("lili");

    }
}
