package interceptingFilter;

/**
 * Created by Administrator on 2017/1/9 0009.
 */
public class Target {
    public void execute(String request){
        System.out.println("executing request: "+request);
    }
}
