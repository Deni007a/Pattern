package поведенчиские.State.Simple_state.state;

public class MoveState implements TransformerState {

    @Override
    public void action() {
        System.out.println("move!!!");
    }
}
