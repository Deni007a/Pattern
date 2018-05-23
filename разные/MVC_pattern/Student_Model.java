package разные.MVC_pattern;
//Модель - модель представляет собой объект или данные JAVA POJO.
// Он также может иметь логику для обновления контроллера,
// если его данные изменяются.

public class Student_Model {

    private String rollNo;
    private String name;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
