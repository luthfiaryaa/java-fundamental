package basic;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(2));
        System.out.println(cars.set(0, "2"));
    }
}
