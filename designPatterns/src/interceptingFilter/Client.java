package interceptingFilter;

/**
 * Created by Administrator on 2017/1/9 0009.
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }
    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
