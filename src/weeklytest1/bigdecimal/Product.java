package weeklytest1.bigdecimal;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public abstract class Product implements Promotion {
    private String name;
    private BigDecimal price;
    private double weight;

    Product(String name, BigDecimal price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public abstract int getDiscountAmount();
}
