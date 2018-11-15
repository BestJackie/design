package frontController;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher() {
        this.studentView = new StudentView();
        this.homeView = new HomeView();
    }

    public Dispatcher(StudentView studentView, HomeView homeView) {
        this.studentView = studentView;
        this.homeView = homeView;
    }
    public void dispatch(String request){
        if (request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }else {
            homeView.show();
        }
    }
}
