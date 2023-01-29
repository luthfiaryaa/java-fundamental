package oop.livingthing;

public class LivingThingApp {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Owl owl =  new Owl();
        Shark shark = new Shark();
        Whale whale = new Whale();
        Eagle eagel =  new Eagle();
        Animal animal1 = new Cat();
        Animal animal2 = new Tiger();

        cat.setName("Kucing");
        tiger.setName("Tiger");
        animal1.setName("Kucing Anggora");
        animal2.setName("Tiger Sumatera");

        animalDemo(cat);
        System.out.println("-------------------------------");
        animalDemo(tiger);
        System.out.println("-------------------------------");
        animalDemo(owl);
        System.out.println("-------------------------------");
        animalDemo(eagel);
        System.out.println("-------------------------------");
        animalDemo(shark);
        System.out.println("-------------------------------");
        animalDemo(whale);
        System.out.println("-------------------------------");
        animalDemo(animal1);
        System.out.println("-------------------------------");
        animalDemo(animal2);
    }

    public static void animalDemo(Animal animal) {
        animal.breathing();
        animal.eating();
        animal.moving();
    }
}
