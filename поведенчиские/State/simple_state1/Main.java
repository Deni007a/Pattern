package поведенчиские.State.simple_state1;

public class Main {
    public static void main(String[] args) {

        Context context = new Context();

        State startState = new StartState(context);
        startState.doAction();
    }
}
