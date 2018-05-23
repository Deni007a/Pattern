package поведенчиские.State;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.toString());
        car.снать_сигнализацию();
        System.out.println(car.toString());
        car.завести();
        System.out.println(car.toString());
        car.выключить();
        System.out.println(car.toString());
        car.поставить_на_сигнализацию();
        System.out.println(car.toString());

    }
}
