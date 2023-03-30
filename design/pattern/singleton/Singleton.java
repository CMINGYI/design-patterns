package pattern.singleton;

public class Singleton {


    private static Singleton singleton;

    private Singleton() {
    }


    public static Singleton  getInstance(){

        if (null == singleton) {
            return new Singleton();
        }
        return singleton;
    }
}
