package compositeEntity;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("test","Data");
        client.printData();
        client.setData("second test","data1");
        client.printData();
    }
}
