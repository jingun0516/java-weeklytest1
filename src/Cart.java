public class Cart {
    private Product[] products;

    Cart(Product[] products) {
        this.products = products;
    }
    int calculateDeliveryCharge() {
        int totalPrice = 0;
        int totalWeight = 0;
        int deliveryFee = 0;

        for(Product product : products) {
            int price = product.getPrice();
            int discountAmount = product.getDiscountAmount();
            int weight = product.getWeight();

            totalPrice += price - discountAmount;
            totalWeight += weight;
        }

        if(totalWeight < 3) {
            deliveryFee = 1000;
        }
        else if(totalWeight >= 10) {
            deliveryFee = 10000;
        }
        else {
            deliveryFee = 5000;
        }

        if(totalPrice >= 100000) {
            deliveryFee = 0;
        }
        else if(totalPrice >= 30000) {
            deliveryFee -= 1000;
        }

        return deliveryFee;
    }
}
