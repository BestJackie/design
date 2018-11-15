package bridge;

/**
 * Created by Administrator on 2016/12/27 0027.
 */
public class Cricle extends Shape {
    private int x,y,radius;

    public Cricle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
