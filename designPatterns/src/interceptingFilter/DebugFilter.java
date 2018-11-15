package interceptingFilter;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: "+request);
    }
}
