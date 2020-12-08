package 接口隔离;

public class PrettyGril implements IGoodBodyGirl,IGreatTemperamentGirl {

    private  String name ;
    public PrettyGril(String _name){
        this.name = _name ;
    }

    @Override
    public void goodLooking() {
            System.out.println(this.name+"脸蛋漂亮");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name+"体型漂亮");
    }

    @Override
    public void greatTemprament() {
        System.out.println(this.name+"很有气质");
    }
}
