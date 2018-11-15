package interpret;

/**
 * Created by Administrator on 2016/12/30 0030.
 */
public class InterpreterPatternDemo {
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarried() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarried();
        System.out.println("John is male: " + isMale.interpret("John"));
        System.out.println("Julie is a married woman: " + isMarriedWoman.interpret("Married Julie"));
    }
}
