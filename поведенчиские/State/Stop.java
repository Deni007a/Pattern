package поведенчиские.State;

public class Stop implements State {
    Car car;

    public Stop(Car car) {
        this.car = car;
    }

    @Override
    public void снать_сигнализацию() {
        System.out.println(" снял сигнализацию");
    }

    @Override
    public void завести() {
        System.out.println(" заводим машину м ставм в состояние старт");
        car.setState(car.getStart());
    }

    @Override
    public void выключить() {
        System.out.println(" двигатель уже выключень ");
    }

    @Override
    public void поставить_на_сигнализацию() {
        System.out.println(" стаим на сигнализацию и переводим в режим стоп ");
        car.setState(this);
    }
    @Override
    public String toString() {
        return "стоп";
    }
}
