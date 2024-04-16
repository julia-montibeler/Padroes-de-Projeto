public class CurrentConditionsDisplay implements Observer, DisplayElement{

    double observerTemperature;

    double observerHumidity;

    double observerPressure;


    @Override
    public void display() {
        System.out.println("Temperatura: "+observerTemperature);
        System.out.println("Umidade: "+observerHumidity);
        System.out.println("Pressão: "+observerPressure);
    };

    @Override
    public void update(Object o) {
        observerTemperature = ((WeatherData)o).getTemperature();
        observerHumidity = ((WeatherData)o).getHumidity();
        observerPressure = ((WeatherData)o).getPressure();
    };



}
