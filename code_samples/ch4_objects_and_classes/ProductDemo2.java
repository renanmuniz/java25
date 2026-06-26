package ch4_objects_and_classes;

public class ProductDemo2 {
    void main() {
        var product1 = new Product( "Laptop", 2000.00);
        var product2 = new Product( "Tablet", 1000.00);

        Product.getNewPrice(product1, 10.0);
        Product.getNewPrice(product2, 10.0);

        IO.println("Product 1 final price: " + product1.getPrice()); // 1800.0
        IO.println("Product 2 final price: " + product2.getPrice()); // 900.0

        Product.swap(product1, product2);
        IO.println("Product 1: " + product1.getName()); // Still "Laptop"
        IO.println("Product 2: " + product2.getName()); // Still "Tablet"

    }
}
