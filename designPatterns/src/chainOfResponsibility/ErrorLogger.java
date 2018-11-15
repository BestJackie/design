package chainOfResponsibility;

/**
 * Created by Administrator on 2016/12/29 0029.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error console::Logger:" + message);
    }
}
