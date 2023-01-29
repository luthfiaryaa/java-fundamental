package oop.classes.object;

public class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int startHeight, int startCadance, int startSpeed, int startGear){
        super(startCadance, startSpeed , startGear);
        this.seatHeight = startHeight;
    }

    public void setHeight(int newValue){
        seatHeight = newValue;
    }
}
