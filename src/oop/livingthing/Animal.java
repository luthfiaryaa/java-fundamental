package oop.livingthing;

public abstract  class Animal extends LivingThing {
    public abstract void moving();

    @Override
    public void eating() {
        System.out.println("This Animal can eating with Mouth");
    }
}
