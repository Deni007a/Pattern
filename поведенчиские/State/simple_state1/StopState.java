package поведенчиские.State.simple_state1;

public class StopState implements State {

Context context;

    public StopState(Context context) {
        this.context = context;
    }

    @Override
    public void doAction() {
        System.out.println("Player is in stop state");
    }

    public String toString(){
        return "Stop State";
    }


}