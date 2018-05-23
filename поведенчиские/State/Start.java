package поведенчиские.State;

public class Start implements State {

    private Car car;

    public Start(Car car) {
        this.car = car;
    }

    @Override
    public void снать_сигнализацию() {
        System.out.println("сигнализацию уже снята");
        //car.setState(car.getStart());
        //gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void завести() {
        System.out.println("ужа заведено ");

    }

    @Override
    public void выключить() {
        System.out.println("Мы выключаем ");
    }

    @Override
    public void поставить_на_сигнализацию() {
        System.out.println("ставм на сигнализацию и переводим в режим Stop ");
        car.setState(car.getStop());
    }

    @Override
    public String toString() {
        return "старт";
    }
}
