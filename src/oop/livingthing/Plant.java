package oop.livingthing;

public class Plant extends LivingThing{
    @Override
    public void breathing() {
        System.out.println("Plant breathing using stomata and lentisel");
    }

    @Override
    public void eating() {
        System.out.println("Plant make foot and eat through the process of photosynthesis");
    }
}
