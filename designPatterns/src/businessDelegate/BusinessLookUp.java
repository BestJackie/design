package businessDelegate;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if (serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else{
            return new JMSService();
        }
    }
}
