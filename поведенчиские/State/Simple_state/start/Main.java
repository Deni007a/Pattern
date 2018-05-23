package поведенчиские.State.Simple_state.start;



import поведенчиские.State.Simple_state.context.TransformerContext;
import поведенчиские.State.Simple_state.state.FireState;
import поведенчиские.State.Simple_state.state.MoveState;
import поведенчиские.State.Simple_state.state.TransformerState;
// State  мы описываем  все стояния которые может иметь  нахотится обект

// Context это текущее состояние обекта
public class Main {

    public static void main(String[] args) {
// создаем  текущие обект
        TransformerContext context = new TransformerContext();

        // создаем различные стояние обекта
        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        // задаем состояние в обект
        context.setState(stateFire);
        context.action();

        context.setState(stateMove);
        context.action();
        
    }
}
