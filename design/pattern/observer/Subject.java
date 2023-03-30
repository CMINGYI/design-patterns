package pattern.observer;

/**
 * 主题抽象
 */
public interface Subject {


    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
