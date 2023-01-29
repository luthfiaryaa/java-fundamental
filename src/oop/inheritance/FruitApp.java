package oop.inheritance;

public class FruitApp {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Mango mango = new Mango();

        apple.name = "Apple";
        mango.name = "Mango";

        apple.getName(apple.name);
        mango.getName(mango.name);
    }
}
