package pattern.adapter.objectAdapter;

import pattern.adapter.classAdapter.Source;

/**
 * 对象适配器
 */
public class Adapter implements Target{

    Source source;

    public Adapter(Source source) {
        this.source = source;
    }


    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("method 2");
    }
}
