package pattern.observer.jdk.observer;

public class TestJdkObserver {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        new CurrentConditionsDisplay(weatherSubject);
        weatherSubject.changedWeather(10, 30);
    }
}
