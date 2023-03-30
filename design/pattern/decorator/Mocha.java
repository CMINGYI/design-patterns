package pattern.decorator;

import java.math.BigDecimal;

public class Mocha extends BeverageDecorate{

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BigDecimal cost() {
        return beverage.cost().add(new BigDecimal("1.4"));
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "mocha";
    }
}
