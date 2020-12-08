package 接口隔离;

public class Client {
    public  static  void main(String args[]) {

        IGoodBodyGirl bodyGirl = new PrettyGril("艳艳") ;
        AbstractSearcher seacher = new Seacher(bodyGirl) ;
        seacher.show();

    }
}
