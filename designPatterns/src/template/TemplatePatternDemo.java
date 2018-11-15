package template;

/**
 * Created by Administrator on 2017/1/5 0005.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println("=====================================================================================================");
        game = new Football();
        game.play();
    }
}
