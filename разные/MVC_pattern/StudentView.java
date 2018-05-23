package разные.MVC_pattern;

//View - View представляет собой визуализацию данных,
// содержащихся в этой модели.

public class StudentView {
    // метод иметирут визуальные данные
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
