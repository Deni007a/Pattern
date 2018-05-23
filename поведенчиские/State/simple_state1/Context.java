package поведенчиские.State.simple_state1;

public class Context {
    private State startState;
    private State stopState;

    private State state;


    public Context() {

        startState = new StartState(this);
        stopState = new StartState(this);
    }

    public State getStartState() {
        return startState;
    }

    public void setStartState(State startState) {
        this.startState = startState;
    }

    public State getStopState() {
        return stopState;
    }

    public void setStopState(State stopState) {
        this.stopState = stopState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
