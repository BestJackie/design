package compositeEntity;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class CoarseGrainedObject {
    DependentObject1 do1 = new DependentObject1();
    DependentObject2 do2 = new DependentObject2();
    public void setData(String data1,String data2){
        do1.setData(data1);
        do2.setData(data2);
    }
    public String[] getData(){
        return new String[]{do1.getData(),do2.getData()};
    }
}
