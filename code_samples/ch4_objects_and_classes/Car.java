package ch4_objects_and_classes;

public class Car {
    String make;
    String model;
    int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public static Car createCar(String type, String make, String model, int year) {
        if (type.equals("sport")) {
            return new SportCar(make, model, year, 300);
        } else if (type.equals("stock")) {
            return new StockCar(make, model, year, 200);
        } else {
            return new Car(make, model, year);
        }
    }

    void displayInfo() {
        IO.println("Car Information:");
        IO.println("Make: " + make);
        IO.println("Model: " + model);
        IO.println("Year: " + year);
    }
}
