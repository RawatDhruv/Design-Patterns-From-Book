
public class StatisticsDisplay implements Observer, DisplayElement {
    private final WeatherStation weatherStation;
    private float temperature;
    private float maxTemperature;
    private float minTemperature;
    private float tempSum;
    private int noOfReadings;
    private float avgTemperature;

    public StatisticsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.maxTemperature = Integer.MIN_VALUE;
        this.minTemperature = Integer.MAX_VALUE;
        this.tempSum = 0;
        this.noOfReadings = 0;
        this.temperature = 0;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherStation.getTemperature();
        noOfReadings++;
        tempSum += temperature;
        if(temperature > maxTemperature) {
            maxTemperature = temperature;
        }
        if(temperature < minTemperature) {
            minTemperature = temperature;
        }
        this.avgTemperature = tempSum / noOfReadings;
    }

    public void display() {
        System.out.println("\nStatistics are : ");
        System.out.println("Temperature : " + temperature);
        System.out.println("Max Temperature : " + maxTemperature);
        System.out.println("Min Temperature : " + minTemperature);
        System.out.println("Avg Temperature : " + avgTemperature);
    }


}
