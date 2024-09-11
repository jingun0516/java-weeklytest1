import lombok.Getter;

@Getter
public abstract class Product implements Promotion {
    private String name;
    private int price;
    private int weight;

    Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public abstract int getDiscountAmount();
}
