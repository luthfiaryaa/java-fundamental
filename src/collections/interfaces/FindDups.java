package collections.interfaces;

import java.util.*;
import java.util.stream.*;

public class FindDups {
    public static void main(String[] args) {
        Set<String> distinctWords = Arrays.asList(args).stream().collect(Collectors.toSet());
//        distinctWords.add("java");
//        distinctWords.add("FindDups");
//        distinctWords.add("i");
//        distinctWords.add("came");
//        distinctWords.add("saw");
//        distinctWords.add("left");
        distinctWords.addAll(Arrays.asList("java","FindDups","i","came","i","saw","i","left"));

        Set<String> s = new HashSet<String>();

        for (String a : args)
            s.add(a);
            s.add("i");
            s.add("came");
            s.add("i");
            s.add("saw");
            s.add("left");
        System.out.println(distinctWords.size() + " distinct words: " + distinctWords);
        System.out.println(s.size() + " distinct words: " + s);
    }
}
