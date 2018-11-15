package mediator;

import java.util.Date;

/**
 * Created by Administrator on 2016/12/30 0030.
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "]:" + message);
    }
}
