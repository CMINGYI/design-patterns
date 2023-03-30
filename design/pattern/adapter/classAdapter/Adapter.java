package pattern.adapter.classAdapter;

/**
 * 类适配器
 */
public class Adapter extends Source implements Target{
    @Override
    public void method2() {
        System.out.println("method 2");
    }
}
