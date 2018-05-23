package разные.MVC_pattern;

//Контроллер - контроллер работает как по Model, так и по View.
// Он управляет потоком данных в объект модели и обновляет представление
// при каждом изменении данных. Он сохраняет вид и модель отдельно.

public class StudentController {
    // экземпляр  модели
    private Student_Model model;
    //экземпляр пердставления
    private StudentView view;
// иницируме модель и представление в конструкторе
    public StudentController(Student_Model model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }
// обновляем представление
    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
