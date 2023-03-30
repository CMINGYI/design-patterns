package pattern.decorator.supermarket;

import java.math.BigDecimal;

public class BasePrice extends Supermarket{
    @Override
    BigDecimal price() {
        return new BigDecimal("15");
    }
}
