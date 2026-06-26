package ch4_objects_and_classes;

public class ProductDemo {
    void main() {
        double price = 1000.00;
        double newPrice = calcFinalPrice(price, 10.0);

        IO.println("Old Price: " + price);
        IO.println("New price: " + newPrice);


    }
    double calcFinalPrice (double price, double discount) {
        price = price - (price * (discount/100));
        return price;
    }
}
