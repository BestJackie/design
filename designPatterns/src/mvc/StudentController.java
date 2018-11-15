package mvc;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

   public void setStudentName(String name){
        model.setName(name);
   }

    public String getStudentName(String name){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(String rollNo){
        return model.getRollNo();
    }

    public void updateView(){
        view.printStudentDetails(model.getRollNo(),model.getName());
    }
}
