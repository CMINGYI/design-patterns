package pattern.factory;

/**
 * 实现工厂方法 生产产品
 */
public class ChinesePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
       return new ChinesePizza();
    }
}
