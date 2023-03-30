package pattern.observer.jdk.observer;

import java.util.Observable;

public class WeatherSubject extends Observable {


    private float temperature;
    private float humidity;

    public void changedWeather(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        setChanged();
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }
}
