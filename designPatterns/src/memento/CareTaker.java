package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/3 0003.
 */
public class CareTaker {
    private List<Memento>mementoList = new ArrayList<>();
    public void add(Memento state){
        mementoList.add(state);
    }
    public Memento get(int index){
        return mementoList.get(index);
    }
}
