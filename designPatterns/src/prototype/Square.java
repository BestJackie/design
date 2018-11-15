package prototype;

/**
 * Created by Administrator on 2016/12/26 0026.
 */
public class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Inside Square::draw()method");;
    }

    public Square() {
        type = "Square";
    }

}
