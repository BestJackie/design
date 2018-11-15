package businessDelegate;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class BusinessDelegatePatternDemo {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate
                = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");
        Client client = new Client(businessDelegate);
        client.doTask();
        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
