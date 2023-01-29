package oop.classes.object;

public class Bicycle implements BicycleInterface{
    public int cadence;
    public int gear;
    public int speed;

    public Bicycle(int startCadence, int startSpeed, int startGear){
        this.cadence = startCadence;
        this.speed = startSpeed;
        this.gear = startGear;
    }

    public void setCadence(int newValue){
        this.cadence = newValue;
    }

    public void setGear(int newValue){
        this.gear = newValue;
    }

    public void applyBreak(int decrement){
        this.speed -= decrement;
    }

    public void speedUp(int increment){
        this.speed += increment;
    }

    @Override
    public int getWeightBicycle(){
        return 0;
    }

}
