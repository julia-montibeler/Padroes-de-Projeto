public class StatisticsDisplay implements Observer, DisplayElement{

    int cont = 0;

    double sumTempeture = 0;
    double maxTempeture;
    double minTempeture;
    double avgTempeture;

    double sumHumidity = 0;
    double maxHumidity;
    double minHumidity;
    double avgHumidity;

    double sumPressure = 0;
    double maxPressure;
    double minPressure;
    double avgPressure;


    @Override
    public void display() {
        System.out.println("Temperatura máxima: "+maxTempeture);
        System.out.println("Temperatura mínima: "+minTempeture);
        System.out.println("Média de Temperatura: "+avgTempeture);
        System.out.println("");
        System.out.println("Umidade máxima: "+maxHumidity);
        System.out.println("Umidade mínima: "+minHumidity);
        System.out.println("Média de Umidade: "+avgHumidity);
        System.out.println("");
        System.out.println("Pressão máxima: "+maxPressure);
        System.out.println("Pressão mínima: "+minPressure);
        System.out.println("Média de Pressão: "+avgPressure);
    };

    @Override
    public void update(Object o) {

        WeatherData wd = (WeatherData)o;

        if (cont == 1) {
            maxTempeture = wd.getTemperature();
            minTempeture = wd.getTemperature();
            maxHumidity = wd.getHumidity();
            minHumidity = wd.getHumidity();
            maxPressure = wd.getPressure();
            minPressure = wd.getPressure();
        }

        sumTempeture += wd.getTemperature();
        avgTempeture = sumTempeture/cont;

        if (minTempeture > wd.getTemperature()) {
            minTempeture = wd.getTemperature();
        }

        if (maxTempeture < wd.getTemperature()) {
            maxTempeture = wd.getTemperature();
        }

        sumHumidity += wd.getHumidity();
        avgHumidity = sumHumidity/cont;

        if (minHumidity > wd.getHumidity()) {
            minHumidity = wd.getHumidity();
        }

        if (maxHumidity < wd.getHumidity()) {
            maxHumidity = wd.getHumidity();
        }

        sumPressure += wd.getPressure();
        avgPressure = sumPressure/cont;

        if (minPressure > wd.getPressure()) {
            minPressure = wd.getPressure();
        }

        if (maxPressure < wd.getPressure()) {
            maxPressure = wd.getPressure();
        }

        cont++;
    }
}
