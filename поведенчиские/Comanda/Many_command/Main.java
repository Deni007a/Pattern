package поведенчиские.Comanda.Many_command;

import поведенчиские.Comanda.Many_command.real_command.*;

// клиент в терменалогии патерна
public class Main {
    public static void main(String[] args) {
        // иницатор ему будет передан обект команда
        SimpleRemoteControl remote = new SimpleRemoteControl();

        //Создание обекта лигнт  который будет получателем запроса;
        Light kitchenRoom = new Light("кухня");
        Stereo bigRoom = new Stereo(" зал");

        // создание команды с указание получателя , управления овещением

        LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenRoom);
        LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenRoom);

        StereoOnCommand bigRoomStereoOn = new StereoOnCommand(bigRoom);
        StereoOffCommand bigRoomStereoOff = new StereoOffCommand(bigRoom);

        // команда передается инициатору
        // готовые команды связываются с ячейками пульта


       // remote.setCommand(0,kitchenRoom::on,kitchenRoom::off); // java 8
        remote.setCommand(0,kitchenRoomLightOn,kitchenRoomLightOff);

        remote.setCommand(1,bigRoomStereoOn,bigRoomStereoOff);




        // иницируется нажатие кнопки

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.undoButtonWasPushed();
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);

    }
}
