package pattern.decorator;

import java.math.BigDecimal;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "house blend";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal("1.5");
    }
}
