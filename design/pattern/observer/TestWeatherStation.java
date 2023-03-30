package pattern.observer;

import java.util.WeakHashMap;

public class TestWeatherStation {
    public static void main(String[] args) {
        // 1.创建主题
        WeatherData weatherData = new WeatherData();
        // 2.订阅主题
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        // 3.主题发布变更
        weatherData.setWeather(10f, 20f, 30f);
    }
}
