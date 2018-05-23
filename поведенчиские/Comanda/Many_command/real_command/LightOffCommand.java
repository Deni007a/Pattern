package поведенчиские.Comanda.Many_command.real_command;

import поведенчиские.Comanda.Many_command.Command;

public class LightOffCommand implements Command {
   private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
       light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
