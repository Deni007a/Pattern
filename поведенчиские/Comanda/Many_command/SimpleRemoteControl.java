package поведенчиские.Comanda.Many_command;


import java.util.Arrays;

//иницатор Invoker
public class SimpleRemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;


    public SimpleRemoteControl() {
        onCommands = new Command[3];
        offCommands = new Command[3];

        // создаем заглушку  и заполняем масивы в конструкторе
        Command noComand = new NoCommand();

        Arrays.fill(onCommands, noComand);
        Arrays.fill(offCommands, noComand);
        undoCommand= noComand;
    }

    //Метод для назначения команды в эти ячейки
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot]  = onCommand;
        offCommands[slot] = offCommand;
    }




    // медод вызываемый при нажаетие кнопки вкл
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        //  при нажатии  мы сначатал читаем команду потом сохраняем сылку на нее
       undoCommand = onCommands[slot];

    }



    // медод вызываемый при нажаетие кнопки выкл
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        //  при нажатии  мы сначатал читаем команду потом сохраняем сылку на нее
        undoCommand = offCommands[slot];

    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
