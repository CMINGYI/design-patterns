package pattern.observer.jdk.observer;

import pattern.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;

    @Override
    public void display() {
        System.out.println("当前温度：" + temperature + "当前湿度：" + humidity);
    }

    public CurrentConditionsDisplay(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherSubject){
            WeatherSubject weatherSubject = (WeatherSubject) o;
            this.temperature = weatherSubject.getTemperature();
            this.humidity = weatherSubject.getHumidity();
            display();
        }
    }
}
