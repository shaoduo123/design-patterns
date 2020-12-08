package 观察者模式;

public abstract  class Observer {
    //监视的目标对象 为抽象对象
    protected AbstractSuspect suspect ;

    public abstract void update() ;
}
