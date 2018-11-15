package flyweight;

import java.util.HashMap;

/**
 * Created by Administrator on 2016/12/28 0028.
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getShape(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color:" + color);
        }
        return circle;
    }
}
