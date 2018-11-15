package single;

/**
 * Created by Administrator on 2016/12/26 0026.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
