package pattern.observer;

/**
 * 观察者抽象
 */
public interface Observer {

    void update(float temperature, float humidity, float pressure);
}
