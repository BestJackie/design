package proxy;

/**
 * Created by Administrator on 2016/12/29 0029.
 */
public class ProxyImage implements Image {
    private ReadImage readImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (readImage == null){
            readImage = new ReadImage(fileName);
        }
        readImage.display();
    }
}
