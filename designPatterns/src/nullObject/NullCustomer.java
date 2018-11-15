package nullObject;

/**
 * Created by Administrator on 2017/1/3 0003.
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public Boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
