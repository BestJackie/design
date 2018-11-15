package strategy;

/**
 * Created by Administrator on 2017/1/3 0003.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
