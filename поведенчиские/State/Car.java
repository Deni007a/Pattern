package поведенчиские.State;

public class Car {

   private State start;
   private State stop;



    private State state;

    public Car() {
        start = new Start(this);
        stop = new Stop(this);
        state = new Stop(this);
    }

    void снать_сигнализацию(){
        state.снать_сигнализацию();
    };
    void завести(){
        state.завести();
    };
    void выключить(){
        state.выключить();
    };
    void поставить_на_сигнализацию(){
        state.поставить_на_сигнализацию();
    };

    public State getStart() {
        return start;
    }

    public void setStart(State start) {
        this.start = start;
    }

    public State getStop() {
        return stop;
    }

    public void setStop(State stop) {
        this.stop = stop;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return ""+state;
    }
}
