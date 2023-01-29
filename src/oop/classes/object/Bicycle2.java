package oop.classes.object;

public class Bicycle2 {
    private int cadence;
    private int gear;
    private int speed;

    public Bicycle2(int startCadence, int startGear, int startSpeed){
        this.cadence = startCadence;
        this.gear = startGear;
        this.speed = startSpeed;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public int getSpeed() {
        return speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}
