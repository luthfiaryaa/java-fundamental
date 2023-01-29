package oop.classes.object;
public class Bicycle2Demo {
    public static void main(String[] args) {
        Bicycle2 bicycle2 = new Bicycle2(5,10,15);

        bicycle2.applyBrake(5);
        bicycle2.setCadence(10);
        System.out.println(bicycle2.getSpeed() + " " + bicycle2.getCadence());
    }
}
