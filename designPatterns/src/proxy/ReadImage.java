package proxy;

/**
 * Created by Administrator on 2016/12/29 0029.
 */
public class ReadImage implements Image {
    private String fileName;

    public ReadImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying:"+fileName);
    }
    private void loadFromDisk(String fileName){
        System.out.println("Loading:"+fileName);
    }
}
