package oop.livingthing;

public abstract class LandAnimal extends Animal{

    @Override
    public void moving() {
        System.out.println("Land animal moving with lengs");
    }

    @Override
    public void breathing() {
        System.out.println("Land animal breathing with lungs");
    }
}
