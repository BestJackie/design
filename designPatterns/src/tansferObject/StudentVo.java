package tansferObject;

/**
 * Created by Administrator on 2017/1/9 0009.
 */
public class StudentVo {
    private String name;
    private int rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public StudentVo(String name, int rollNo) {

        this.name = name;
        this.rollNo = rollNo;
    }
}
