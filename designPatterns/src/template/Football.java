package template;

/**
 * Created by Administrator on 2017/1/5 0005.
 */
public class Football extends Game {
    @Override
    void initealize() {
        System.out.println("Football Game Initialized!Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPaly() {
        System.out.println("Football Game Finished!");
    }
}
