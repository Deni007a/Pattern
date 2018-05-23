package поведенчиские.Comanda.Many_command.real_command;

import поведенчиские.Comanda.Many_command.Command;

public class LightOnCommand implements Command {
   private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
