package state;

/**
 * Created by Administrator on 2017/1/3 0003.
 */
public class Context {
    private State state;

    public Context() {
    }

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
