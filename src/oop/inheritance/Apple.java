package oop.inheritance;

public class Apple extends Fruit {
    @Override
    public void getName(String name) {
        System.out.println("This is " + name);
    }
}
