
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private final WeatherStation weatherStation;
    private float temperature;
    private float humidity;
    public CurrentConditionsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }
    public void update() {
        this.temperature = weatherStation.getTemperature();
        this.humidity = weatherStation.getHumidity();
    }
    public void display() {
        System.out.println("\nCurrent Conditions Temperature: " + temperature);
        System.out.println("Current Conditions Humidity: " + humidity);
    }
}
