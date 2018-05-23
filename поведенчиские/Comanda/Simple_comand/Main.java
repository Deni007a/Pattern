package поведенчиские.Comanda.Simple_comand;
// клиент в терменалогии патерна
public class Main {
    public static void main(String[] args) {
        // иницатор ему будет передан обект команда
        SimpleRemoteControl remote = new SimpleRemoteControl();

        //Создание обекта лигнт  который будет получателем запроса;
        Light light = new Light();

        // создание команды с указание получателя
        LightOnCommand lightOn = new LightOnCommand(light);

        // команда передается инициатору

       // remote.setCommand(lightOn);
        remote.setCommand(light::on); // java 8

        // иницируется нажатие кнопки
        remote.buttonWasPressend();


    }
}
