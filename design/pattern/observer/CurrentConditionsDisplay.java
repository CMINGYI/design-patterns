package pattern.observer;

/**
 * 天气观察者
 */
public class CurrentConditionsDisplay implements DisplayElement,Observer{

    private float temperature;

    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前温度：" + temperature + "当前湿度：" + humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
      this.temperature = temperature;
      this.humidity = humidity;
      display();
    }
}
