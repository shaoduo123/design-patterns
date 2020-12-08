package 接口隔离;

public class Seacher extends AbstractSearcher {

    public Seacher(IGoodBodyGirl _goodBodyGirl) {
        super(_goodBodyGirl);
    }

    public Seacher(IGreatTemperamentGirl _greateTemperamentGirl) {
        super(_greateTemperamentGirl);
    }

    @Override
    public void show() {
        if(super.goodBodyGirl!=null) {
            super.goodBodyGirl.goodLooking();
            super.goodBodyGirl.niceFigure();
        }
        if(super.greatTemperamentGirl !=null) {
            super.greatTemperamentGirl.greatTemprament();
        }
    }
}
