package bigdecimal;

import java.math.BigDecimal;

public class Cart implements DeliveryChargeCalculator{
    private Product[] products;

    Cart(Product[] products) {
        this.products = products;
    }

    BigDecimal calculateDeliveryCharge() {
        BigDecimal totalPrice = BigDecimal.ZERO;
        double totalWeight = 0;
        BigDecimal deliveryCharge = BigDecimal.ZERO;

        for(Product product : products) {
            BigDecimal price = product.getPrice();
            BigDecimal discountAmount = new BigDecimal(product.getDiscountAmount());
            double weight = product.getWeight();

            totalPrice = totalPrice.add(price.subtract(discountAmount));
            totalWeight += weight;
        }

        deliveryCharge = getDeliveryCharge(totalWeight, totalPrice);

        return deliveryCharge;
    }

    @Override
    public BigDecimal getDeliveryCharge(Double weight, BigDecimal price) {
        BigDecimal deliveryCharge = BigDecimal.ZERO;

        if(weight < 3) {
            deliveryCharge = BigDecimal.valueOf(1000);
        }
        else if(weight >= 10) {
            deliveryCharge = BigDecimal.valueOf(10000);
        }
        else {
            deliveryCharge = BigDecimal.valueOf(5000);
        }

        if(price.compareTo(new BigDecimal("100000")) >= 0) {
            deliveryCharge = BigDecimal.ZERO;
        }
        else if(price.compareTo(new BigDecimal("30000")) >= 0) {
            deliveryCharge = deliveryCharge.subtract(new BigDecimal("1000"));
        }

        return deliveryCharge;
    }
}
