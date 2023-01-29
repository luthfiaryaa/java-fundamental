package collections.aggregate.operation;

import java.util.*;

public class Interference {
    public static void main(String[] args) {
        try {
            List<String> listOfString = new ArrayList<>(Arrays.asList("one", "two"));
            String concatenatedString = listOfString.stream().peek(s -> listOfString.add("three"))
                    .reduce((a, b) -> a + " " + b).get();
            System.out.println("Concatenated string: " + concatenatedString);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.toString());
        }
    }
}
