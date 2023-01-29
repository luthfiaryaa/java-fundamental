package oop.abstrak;

public class VehicleApp {
    public static void main(String[] args) {
        Car car = new Car();

        Bicycle sepeda = new Bicycle();
        car.lokasi = "Home";
        car.getSpeed(12, "BMW");
        sepeda.getSpeed(12, "Bicycle");

    }
}
