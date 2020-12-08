package 接口隔离;

public abstract class AbstractSearcher {
    protected IGoodBodyGirl goodBodyGirl ;
    protected IGreatTemperamentGirl greatTemperamentGirl ;

    public AbstractSearcher(IGoodBodyGirl _goodBodyGirl) {
        this.goodBodyGirl = _goodBodyGirl ;

    }

    public AbstractSearcher(IGreatTemperamentGirl _greateTemperamentGirl) {
        this.greatTemperamentGirl = _greateTemperamentGirl ;

    }

    //展示美女
    public abstract  void show() ;

}
