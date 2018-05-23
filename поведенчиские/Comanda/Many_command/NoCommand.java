package поведенчиские.Comanda.Many_command;



// класс заглушка
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("заглушка");
    }

    @Override
    public void undo() {

    }
}
