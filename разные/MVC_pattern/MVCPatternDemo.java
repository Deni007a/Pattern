package разные.MVC_pattern;

public class MVCPatternDemo {
    public static void main(String[] args) {

        //получить запись студента на основе его rool в базе данных
        Student_Model model  = retriveStudentFromDatabase();

        //Создание представления: запись сведений о студенте на консоли
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //обновление модели
        controller.setStudentName("new John");

        controller.updateView();
    }
        // метод где как бы извлекапем студента из базы  б тут просто его создаем
    private static Student_Model retriveStudentFromDatabase(){
        Student_Model student = new Student_Model();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
