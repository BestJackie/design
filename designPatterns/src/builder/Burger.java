package builder;

/**
 * Created by Administrator on 2016/12/26 0026.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
