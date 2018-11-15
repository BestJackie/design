package adapter;

/**
 * Created by Administrator on 2016/12/26 0026.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name:"+fileName);;
    }
}
