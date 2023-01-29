package oop.classes.object;

public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(5,10,5);
        MountainBike mountainbike = new MountainBike(5,10,10,5);

        bicycle.speedUp(5);
        System.out.println("Bicycle");
        System.out.println("Cadance: " + bicycle.cadence + " Speed: " + bicycle.speed + " Gear: " + bicycle.gear);
        System.out.println("-------------------------------------------");
        mountainbike.setHeight(5);
        System.out.println("Mountainbike");
        System.out.println("Height: " + mountainbike.seatHeight + " Cadance: " + mountainbike.cadence +
                 " Speed: " + mountainbike.speed + " Gear: " + mountainbike.gear);
    }
}
