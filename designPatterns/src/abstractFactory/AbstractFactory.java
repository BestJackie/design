package abstractFactory;

/**
 * Created by Administrator on 2016/12/26 0026.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
