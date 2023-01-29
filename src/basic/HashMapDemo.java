package basic;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name.first", "aa");
        map.put("name.middle", "bb");
        map.put("name.last", "cc");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));
    }
}
