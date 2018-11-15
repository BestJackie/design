package abstractFactory;

/**
 * Created by Administrator on 2016/12/26 0026.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }else if (factoryType.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }

}
