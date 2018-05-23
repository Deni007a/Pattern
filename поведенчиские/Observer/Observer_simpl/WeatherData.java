package поведенчиские.Observer.Observer_simpl;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers; // список для хранения наблюдателей
    private double temp;
    private double humidity;
    private double pressure;
    //в конструкторе делаем список
    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o); //добовляем наблюдателя
    }

    @Override
    public void removeObserver(Observer o) {

        int i = observers.indexOf(o);  //  если индекса нету то возвращется -1
        if (i >= 0) { observers.remove(i);// удаляем наблюдателя
        }
    }

    @Override
    public void notifyObserver() {

        for (Observer observer : observers) {
            observer.update(temp, humidity, pressure);
        }
    }

    public void measurementsChanged() { // оповещаем наблюдателя об изменениях
        notifyObserver(); }

    public void setMeasurements(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged(); //высавляем значения потов вызываем метод для оповещения
    }

    public double getTemp() { return temp; }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
