package tansferObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/9 0009.
 */
public class StudentBO {
    List<StudentVo> students;

    public StudentBO() {
        students = new ArrayList<>();
        StudentVo studentVo = new StudentVo("test", 0);
        StudentVo studentVo1 = new StudentVo("test1", 1);
        students.add(studentVo);
        students.add(studentVo1);
    }
    public void deleteStudent(StudentVo studentVo){
        students.remove(studentVo.getRollNo());
        System.out.println("Student: Roll No " + studentVo.getRollNo() + ", deleted from database");
    }
    public List<StudentVo> getAllStudents() {
        return students;
    }

    public StudentVo getStudent(int rollNo) {
        return students.get(rollNo);
    }

    public void updateStudent(StudentVo student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() +", updated in the database");
    }

}
