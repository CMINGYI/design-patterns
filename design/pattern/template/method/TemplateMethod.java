package pattern.template.method;

public abstract class TemplateMethod {

    final void templateMethod(){
        method1();
        method2();
        method3();
    }

    abstract void method1();

    abstract void method2();


    void method3(){

    }
}
