//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        DisplayElement display1 = new CurrentConditionsDisplay(station);
        DisplayElement display2 = new StatisticsDisplay(station);
        station.getWeather(25.2F,90.0F);
        display1.display();
        display2.display();
        station.getWeather(30.5F,75.0F);
        display1.display();
        display2.display();
    }
}