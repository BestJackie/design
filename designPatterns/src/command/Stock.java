package command;

/**
 * Created by Administrator on 2016/12/29 0029.
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name +
                " Quantity: " + quantity + " ] bought");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name +
                " Quantity: " + quantity + " ] sell");
    }
}
