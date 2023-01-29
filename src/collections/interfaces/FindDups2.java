package collections.interfaces;

import java.util.*;

public class FindDups2 {
    public static void main(String[] args) {
        Set<String> uniques = new HashSet<String>();
        uniques.add("i");
        uniques.add("came");
        uniques.add("i");
        uniques.add("saw");
        uniques.add("i");
        uniques.add("left");
        Set<String> dups = new HashSet<String>();
        dups.add("i");

        for (String a : args)
            if (uniques.add(a))
                dups.add(a);

        uniques.removeAll(dups);

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
    }
}
