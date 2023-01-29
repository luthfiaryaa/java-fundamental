package oop.livingthing;

public class Cat extends LandAnimal{
    @Override
    public void eating(){
        System.out.println(getName() + " eating meow meow");
    }
}
