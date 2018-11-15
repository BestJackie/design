package single;

/**
 * Created by Administrator on 2016/12/26 0026.
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    public SingleObject() {
    }
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("hello world");
    }
}
