public class ForecastDisplay implements Observer, DisplayElement{
    double observerTemperature;

    double observerHumidity;

    double observerPressure;


    @Override
    public void display() {
        System.err.println("Previsão do tempo");
    };

    @Override
    public void update(Object o) {
        observerTemperature = ((WeatherData)o).getTemperature();
        observerHumidity = ((WeatherData)o).getHumidity();
        observerPressure = ((WeatherData)o).getPressure();
    }
}
