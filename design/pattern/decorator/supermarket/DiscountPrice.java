package pattern.decorator.supermarket;

import java.math.BigDecimal;

public class DiscountPrice extends DiscountDecorate{
    Supermarket supermarket;

    public DiscountPrice(Supermarket supermarket) {
        this.supermarket = supermarket;
    }

    @Override
    public String getDesc() {
        return supermarket.getDesc() + "折扣";
    }

    @Override
    BigDecimal price() {
        return supermarket.price().add(new BigDecimal("10"));
    }
}
