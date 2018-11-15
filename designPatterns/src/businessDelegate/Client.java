package businessDelegate;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService) {
        this.businessService = businessService;
    }
    public void doTask(){
        businessService.doTask();
    }

}
