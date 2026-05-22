package ch4_objects_and_classes;

public class StockCar extends Car {
    int topSpeed;

    public StockCar(String make, String model, int year, int topSpeed) {
        super(make, model, year);
        this.topSpeed = topSpeed;
    }
}
