package oop.livingthing;

public abstract class WaterAnimal extends Animal {

    @Override
    public void moving() {
        System.out.println("Water animal moving with tail fin");
    }

    @Override
    public void breathing() {
        System.out.println("Water animal breathing with lungs");
    }
}
