package поведенчиские.Comanda.Simple_comand;
//иницатор Invoker
public class SimpleRemoteControl {
    Command slot1;

    //Метод для назначения команды
    public  void setCommand(Command command){
        slot1 = command;
    }
    // медод вызываемый при нажаетие кнопки
    public  void buttonWasPressend(){
        slot1.execute();
    }
}
