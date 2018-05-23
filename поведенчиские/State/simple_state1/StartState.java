package поведенчиские.State.simple_state1;
public class StartState implements State {

    private Context context;

    public StartState(Context context) {
        this.context = context;
    }

    public void doAction() {
        System.out.println("Player is in start state");

    }

    public String toString(){
        return "Start State";
    }

}