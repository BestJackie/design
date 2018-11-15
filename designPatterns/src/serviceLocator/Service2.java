package serviceLocator;

/**
 * Created by Administrator on 2017/1/9 0009.
 */
public class Service2 implements  Service {
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }
}
