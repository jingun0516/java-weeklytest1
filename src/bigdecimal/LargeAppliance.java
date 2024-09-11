package bigdecimal;

import java.math.BigDecimal;

public class LargeAppliance extends Product {
    LargeAppliance(String name, BigDecimal price, double weight){
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 0;
    }
}
