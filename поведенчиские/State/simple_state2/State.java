package поведенчиские.State.simple_state2;

// State  мы описываем  все стояния которые может иметь  нахотится обект

// Context это текущее состояние обекта

public interface State {
    public void doAction(Context context);
}