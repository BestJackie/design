package bridge;

/**
 * Created by Administrator on 2016/12/27 0027.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Cricle(new RedCircle(),100,100,100);
        Shape greenCircle = new Cricle(new GreenCircle(),50,50,50);
        redCircle.draw();
        greenCircle.draw();
    }
}
