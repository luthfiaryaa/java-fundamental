package oop.livingthing;

public abstract class AirAnimal extends Animal {
    @Override
    public void moving() {
        System.out.println("Air Animal breating with Lungs ");
    }

    @Override
    public void breathing() {
        System.out.println("Air animal moving with wings");
    }

}
