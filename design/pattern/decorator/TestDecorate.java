package pattern.decorator;

public class TestDecorate {


    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        Beverage mocha = new Mocha(espresso);
        System.out.println("desc:" + mocha.getDescription() + "cost:" + mocha.cost());
    }
}
