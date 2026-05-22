package ch4_objects_and_classes;

public class CarDemo {
     void main() {
        Car car1 = Car.createCar("sport", "Ferrari", "488 GTB", 2019);
        Car car2 = Car.createCar("stock", "Toyota", "Camry", 2020);
        Car car3 = Car.createCar("sedan", "Honda", "Accord", 2021);

        IO.println(car1.getClass().getSimpleName());
        car1.displayInfo();

        IO.println(car2.getClass().getSimpleName());
        car2.displayInfo();

        IO.println(car3.getClass().getSimpleName());
        car3.displayInfo();
    }
}
