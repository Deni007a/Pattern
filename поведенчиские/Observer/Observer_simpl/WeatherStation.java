package поведенчиские.Observer.Observer_simpl;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(); // субект

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
      //  StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
      //  ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(1,1,1);
        weatherData.setMeasurements(82, 70, 29.2);
        weatherData.setMeasurements(78, 90, 29.2);
    }
}
