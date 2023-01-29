package basic;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

    enum months{
        JANUARY, FEBRUARY, MARET
    }

    public static void main(String[] args) {
        Set<months> set = EnumSet.allOf(months.class);
        Iterator<months> iter = set.iterator();;
        while (iter.hasNext())
            System.out.println(iter.next());
    }
}
