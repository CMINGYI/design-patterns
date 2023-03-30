package pattern.factory.simple;

public class TestFactory {
    public static void main(String[] args) {
        PizzaStore chinesePizzaStore = new ChinesePizzaStore();
        Pizza pizza = chinesePizzaStore.orderPizza("chinese");
        System.out.println(pizza.getName());
    }
}
