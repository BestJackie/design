package template;

/**
 * Created by Administrator on 2017/1/5 0005.
 */
public abstract class Game {
    abstract void initealize();
    abstract void startPlay();
    abstract void endPaly();
    public final void play(){
        initealize();
        startPlay();
        endPaly();
    }
}
