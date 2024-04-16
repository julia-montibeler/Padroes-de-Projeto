public class App {
    public static void main(String[] args) throws Exception {
        WeatherData w = new WeatherData();

        CurrentConditionsDisplay cd = new CurrentConditionsDisplay();
        StatisticsDisplay sd = new StatisticsDisplay();

        w.registerObserver(sd);

        w.changeMeasurements(20, 10, 10);
        w.changeMeasurements(10, 10, 10);

        sd.display();
    }
}
