package prototype;

/**
 * Created by Administrator on 2016/12/26 0026.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape cloneShape1 = ShapeCache.getShape("1");
        System.out.println("shape:"+cloneShape1.getType());


        Shape cloneShape2 = ShapeCache.getShape("2");
        System.out.println("shape:"+cloneShape2.getType());


        Shape cloneShape3 = ShapeCache.getShape("3");
        System.out.println("shape:"+cloneShape3.getType());

    }
}
