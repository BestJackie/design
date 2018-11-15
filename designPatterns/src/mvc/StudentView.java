package mvc;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class StudentView {
    public void printStudentDetails(String studentRollNo, String studentName) {
        System.out.println("Student:");
        System.out.println("Name: " + studentName);
        System.out.println("RollNo: " + studentRollNo);
    }
}
