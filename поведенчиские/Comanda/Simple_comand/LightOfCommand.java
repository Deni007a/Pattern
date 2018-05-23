package поведенчиские.Comanda.Simple_comand;

public class LightOfCommand implements Command {
   private Light light;

    public LightOfCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
       light.off();
    }
}
