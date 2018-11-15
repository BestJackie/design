package tansferObject;

/**
 * Created by Administrator on 2017/1/9 0009.
 */
public class TransferObjectPatternDemo {
    public static void main(String[] args) {
        StudentBO studentBO = new StudentBO();
        for (StudentVo student : studentBO.getAllStudents()) {
            System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }
        StudentVo student = studentBO.getAllStudents().get(0);
        student.setName("Michael");
        studentBO.updateStudent(student);
        student = studentBO.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }

}