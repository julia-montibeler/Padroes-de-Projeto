public class WeatherData implements Subject{

    private double temperature;
    private double pressure;
    private double humidity;

    WeatherData() {
        temperature = 0;
        pressure = 0;
        humidity = 0;
    }

    @Override
    public void registerObserver(Observer o){
        observers.add(o);
        o.update(this);
    };

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    };

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    
    };

    public double getTemperature(){
        return temperature;

    };

    public double getHumidity(){
        return humidity;

    };

    public double getPressure() {
        return pressure;

    };

    public void changeMeasurements(double t, double h, double p) {
        temperature = t;
        humidity = h;
        pressure = p;
        notifyObservers();
    }

}
