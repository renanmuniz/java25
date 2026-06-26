package ch4_objects_and_classes;

public class Product {
    private String name;
    private double price;

    public static double getNewPrice(Product p, double discount) {
        p.price = p.price - (p.price * (discount/100));
        return p.price;
    }

    public static void swap(Product p1, Product p2) {
        Product temp = p1;
        p1 = p2;
        p2 = temp;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
