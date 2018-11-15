package state;

/**
 * Created by Administrator on 2017/1/3 0003.
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }
    public String toString(){
        return "Start state";
    }
}
