package visitor;

/**
 * Created by Administrator on 2017/1/5 0005.
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);

}
