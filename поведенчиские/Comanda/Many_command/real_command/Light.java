package поведенчиские.Comanda.Many_command.real_command;
// получатель Receiver
public class Light {
    String location;


    public Light(String location) {
        this.location = location;
    }


    public void on(){
        System.out.println(location+" Свет включен");
    }
    public void off(){
        System.out.println(location+" Свет выключен");
    }

}
