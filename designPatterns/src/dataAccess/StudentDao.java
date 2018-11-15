package dataAccess;

import java.util.List;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public interface StudentDao {
    List<Student> getAllStudents();
    Student getStudent(int rollNo);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}
