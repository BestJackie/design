package compositeEntity;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();
    public void setData(String data1,String data2){
        cgo.setData(data1,data2);
    }
    public String[] getData(){
        return cgo.getData();
    }
}
