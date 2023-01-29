package collections.interfaces;

import essential.java.classes.exception.*;

import java.util.*;

public class IterableApp {

    public static void main(String[] args) {

        Iterable<String> names = List.of("a", "b", "c");

        for (String name : names){
            System.out.println(name);
        }
        System.out.println("\n"+names);
    }
}
