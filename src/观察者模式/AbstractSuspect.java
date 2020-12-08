package 观察者模式;

import java.util.ArrayList;
import java.util.List;

public class AbstractSuspect {

    private List<Observer> observers = new ArrayList<Observer>() ;

    private String suspenctName ;

    //添加观察者
    public void attach(Observer observer){
        observers.add(observer) ;
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update() ;
        }
    }



    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public String getSuspenctName() {
        return suspenctName;
    }

    public void setSuspenctName(String suspenctName) {
        this.suspenctName = suspenctName;

        //通知观察者 变更了
        notifyAllObservers();
    }
}
