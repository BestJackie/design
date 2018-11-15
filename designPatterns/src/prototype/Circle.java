package prototype;

/**
 * Created by Administrator on 2016/12/26 0026.
 */
public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Inside Circle::draw()method.");
        ;
    }

    public Circle() {
        type = "Circle";
    }
}
