package weeklytest1.bigdecimal;

import java.math.BigDecimal;

public interface DeliveryChargeCalculator {
    BigDecimal getDeliveryCharge(Double weight, BigDecimal price);
}
