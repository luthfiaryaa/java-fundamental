package oop.livingthing;

public abstract class LivingThing {
    private String name;

    public abstract void breathing();
    public abstract void eating();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
