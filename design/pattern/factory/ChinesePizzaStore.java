package pattern.factory;

public class ChinessPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
       return new ChinessPizza();
    }
}
