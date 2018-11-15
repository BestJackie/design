package command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/29 0029.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();
    public void takeOrder(Order order){
        orderList.add(order);
    }
    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
