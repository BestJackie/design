package bridge;

/**
 * Created by Administrator on 2016/12/27 0027.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape (DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
