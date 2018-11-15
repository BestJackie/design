package mediator;

/**
 * Created by Administrator on 2016/12/30 0030.
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void sengMessage(String  message){
        ChatRoom.showMessage(this,message);
    }
}
