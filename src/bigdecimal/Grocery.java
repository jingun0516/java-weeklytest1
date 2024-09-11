package bigdecimal;

import java.math.BigDecimal;

public class Grocery extends Product {
    Grocery(String name, BigDecimal price, double weight){
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 2000;
    }
}
