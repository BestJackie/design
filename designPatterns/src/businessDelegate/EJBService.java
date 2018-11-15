package businessDelegate;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
