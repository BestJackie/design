package mediator;

/**
 * Created by Administrator on 2016/12/30 0030.
 */
public class MediatorDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");
        robert.sengMessage("hi john");
        john.sengMessage("hello robert");
    }
}
