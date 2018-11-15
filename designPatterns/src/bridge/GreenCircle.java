package bridge;

/**
 * Created by Administrator on 2016/12/27 0027.
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println(
                "Drawing Circle [" +
                        "color:green," +
                        "radius:" + radius + ",x:" + x +
                        ",y:" + y + "]"
        );
    }
}
