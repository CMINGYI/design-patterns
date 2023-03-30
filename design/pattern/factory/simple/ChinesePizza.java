package pattern.factory.simple;

/**
 * 具体产品
 */
public class ChinesePizza extends Pizza{


    public ChinesePizza() {
        name = "chinese";
        dough = "this is dough";
        sauce = "sss";
        toppings.add("top");
    }


    @Override
    void bake() {
        super.bake();
    }

    @Override
    void cut() {
        super.cut();
    }

    @Override
    void box() {
        super.box();
    }
}
