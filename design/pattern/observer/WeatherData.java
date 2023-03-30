package pattern.observer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 天气主题
 */
public class WeatherData implements Subject{


    private final List<Observer> observerList;


    private float temperature;


    private float humidity;


    private float pressure;




    public WeatherData(){
        observerList = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observerList.indexOf(observer);
        if (i >= 0) {
            observerList.remove(observer);
        }

    }

    @Override
    public void notifyObservers() {
        if (observerList.isEmpty()) {
            System.out.println("observer is  empty");
        }
       observerList.forEach(o -> o.update(temperature, humidity, pressure));
    }


    public void weatherChanged() {
        notifyObservers();
    }

    public void setWeather(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        weatherChanged();
    }
}
