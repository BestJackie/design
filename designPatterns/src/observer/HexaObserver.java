package observer;

/**
 * Created by Administrator on 2017/1/3 0003.
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String: "+Integer.toHexString(subject.getState()).toUpperCase());
    }
}
