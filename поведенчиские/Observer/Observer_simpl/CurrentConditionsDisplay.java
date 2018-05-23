package поведенчиские.Observer.Observer_simpl;

// текущее отображение условий берем только температуру и влажность
public  class CurrentConditionsDisplay implements Observer, DisplayElement {
    private double temp;
    private double humidity;

    private Subject weatherData;  // субект


    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData; // получаем экземпляр субекта
        weatherData.registerObserver(this);  // регестириуемся у субекта
    }

    @Override
    public void display() {
        System.out.println(" темеператру " + temp +" влажность "+weatherData);
    }





    @Override
    public void update(double temp, double humidity, double pressure) {
        // обновляем значения потом выводи их Display
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
