package pattern.decorator;

import java.math.BigDecimal;

public class Espresso extends Beverage{

    public Espresso() {
        description = "espresso";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("1.2");
    }
}
