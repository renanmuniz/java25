package ch4_objects_and_classes;

public class SportCar extends Car {
    int topSpeed;

    public SportCar(String make, String model, int year, int topSpeed) {
        super(make, model, year);
        this.topSpeed = topSpeed;
    }
}
