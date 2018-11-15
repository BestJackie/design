package builder;

/**
 * Created by Administrator on 2016/12/26 0026.
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.6f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
