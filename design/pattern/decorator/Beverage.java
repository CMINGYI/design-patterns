package pattern.decorator;

import java.math.BigDecimal;

public abstract class Beverage {

    String description = "unKnow beverage";


    public String getDescription(){
        return description;
    }

    public abstract BigDecimal cost();
}
