package chainOfResponsibility;

/**
 * Created by Administrator on 2016/12/29 0029.
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("standard console ::logger: " + message);
    }
}
