package chapter_3;


public class CarModel {
    public static void main(String[] args) {
        Car myCar = new Car("Tesla");

        System.out.println("Car model is: " + myCar.model);
    }
}

class Car {
    String model;

    Car(String carModel) {
        model = carModel;
        System.out.println("Car constructor called for: " + model);
    }
}
