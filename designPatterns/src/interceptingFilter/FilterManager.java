package interceptingFilter;

/**
 * Created by Administrator on 2017/1/9 0009.
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }
    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
