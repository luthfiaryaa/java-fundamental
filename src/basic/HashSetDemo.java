package basic;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        //check data in hastset
        System.out.println(cars.contains("Volvo"));
        //print hashset
        System.out.println(cars);
        //remove hashset
        System.out.println(cars.remove("Volvo") +" "+ cars);
    }
}
