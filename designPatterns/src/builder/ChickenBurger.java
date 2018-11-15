package builder;

/**
 * Created by Administrator on 2016/12/26 0026.
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "chicken burger";
    }
}
