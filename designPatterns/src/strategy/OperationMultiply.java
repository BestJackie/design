package strategy;

/**
 * Created by Administrator on 2017/1/3 0003.
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
