package template;

/**
 * Created by Administrator on 2017/1/5 0005.
 */
public class Cricket extends Game {
    @Override
    void initealize() {
        System.out.println("Cricket Game initialized " +
                "Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started! Enjoy the game!");
    }

    @Override
    void endPaly() {
        System.out.println("Cricket Game finished");
    }

}
