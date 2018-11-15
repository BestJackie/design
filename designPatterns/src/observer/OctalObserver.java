package observer;

/**
 * Created by Administrator on 2017/1/3 0003.
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "+Integer.toOctalString(subject.getState()));
    }
}
