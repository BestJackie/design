package dataAccess;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class StudentDaoImpl implements StudentDao {
List<Student> students;

    public StudentDaoImpl() {
        students = new ArrayList<>();
        Student student1 = new Student("test",0);
        Student student2 = new Student("test1",1);
        students.add(student1);
        students.add(student2);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("update finish");
    }

    @Override
    public void deleteStudent(Student student) {
        if (students.size()>=student.getRollNo())
            students.remove(student.getRollNo());
    }
}
