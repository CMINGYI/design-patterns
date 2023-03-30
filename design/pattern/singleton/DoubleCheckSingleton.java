package pattern.singleton;

public class DoubleCheckSingleton {

    private static  volatile DoubleCheckSingleton singleton;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance(){
        if (null == singleton) {
            synchronized (Singleton.class) {
                if (null == singleton) {
                    return new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
