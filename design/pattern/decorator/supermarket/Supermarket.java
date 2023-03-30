package pattern.decorator.supermarket;

import java.math.BigDecimal;

public abstract class Supermarket {

    String desc;

    public String getDesc() {
        return desc;
    }

    abstract BigDecimal price();
}
