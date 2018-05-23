package поведенчиские.State.Simple_state.context;

// State  мы описываем  все стояния которые может иметь  нахотится обект

// Context это текущее состояние обекта

import поведенчиские.State.Simple_state.state.TransformerState;

public class TransformerContext implements TransformerState {
    
    private TransformerState state;

    public TransformerState getState() {
        return state;
    }
// задаем состояние обьекта
    public void setState(TransformerState state) {
        this.state = state;
    }   

    @Override
    public void action() {
        this.state.action();
    }
   
    
}
