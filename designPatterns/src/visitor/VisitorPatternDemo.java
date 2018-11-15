package visitor;

/**
 * Created by Administrator on 2017/1/5 0005.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
