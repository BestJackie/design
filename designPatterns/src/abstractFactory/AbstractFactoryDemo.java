package abstractFactory;

/**
 * Created by Administrator on 2016/12/26 0026.
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactroy = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFactroy.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactroy.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapeFactroy.getShape("SQUARE");
        shape3.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("RED");
        color1.fill();
        Color color2 = colorFactory.getColor("BLUE");
        color2.fill();
        Color color3 = colorFactory.getColor("GREEN");
        color3.fill();
    }
}
