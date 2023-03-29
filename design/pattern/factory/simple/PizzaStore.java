package pattern.factory;

/**
 * 实现了操纵产品的所有方法 不实现工厂方法
 */
public abstract class PizzaStore {

   public Pizza orderPizza(String type) {
       Pizza pizza;
       pizza = createPizza(type);
       pizza.prepare();
       pizza.bake();
       pizza.cut();
       pizza.box();
       return pizza;
   }

   protected abstract Pizza createPizza(String type);
}
