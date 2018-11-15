package chainOfResponsibility;

/**
 * Created by Administrator on 2016/12/29 0029.
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("file console::Logger: " + message);
    }
}
