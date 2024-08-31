package ex_24082024_aug_CollectionFramework;

import java.util.*;

public class Lab_075_maps {
    public static void main(String[] args) {
        Map hm = new HashMap();  //any random order it will add, no duplicate
        hm.put("name", "Praj");
        hm.put("address", "Mumbai");
        hm.put("number", "9874561235");
        System.out.println(hm);
        System.out.println(hm.isEmpty());

        Map lm = new LinkedHashMap();  //in order will insert data it will add, no duplicate
        lm.put("name", "Praj");
        lm.put("address", "Mumbai");
        lm.put("number", "9874561235");
        System.out.println(lm);
        System.out.println(lm.containsKey("name"));

        Map<String,String> tm = new TreeMap<>();  //in ascending order will insert data it will add, no duplicate
        tm.put("name", "Praj");
        tm.put("address", "Mumbai");
        tm.put("number", "9874561235");
        System.out.println(tm);
        System.out.println(tm.containsValue("Mumbai"));
        System.out.println(tm.keySet());
    }
}
