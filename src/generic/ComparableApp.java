package generic;

import java.util.*;
import generic.util.*;
public class ComparableApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("one", "two"),
                new Person("three", "two"),
                new Person("five", "two")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
