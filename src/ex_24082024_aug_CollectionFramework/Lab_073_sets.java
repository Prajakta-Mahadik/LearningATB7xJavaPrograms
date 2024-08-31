package ex_24082024_aug_CollectionFramework;

import java.util.*;

public class Lab_073_sets {
    public static void main(String[] args) {
        HashSet s= new HashSet();  //insertion will be done randomly-Hashing mechanism
        s.add("Apple");
        s.add("Mango");
        s.add("Grapes");
        s.add("Grapes"); //doesnt allow the duplicates
        s.add(null); //allow one null value
        System.out.println(s);
        for(Object o: s)
        {
            System.out.println(o);
        }

//        Set s1= new LinkedHashSet();  //insertion will be done in the order we add data
//        s1.add(10);
//        s1.add(90);
//        s1.add(40);
//        s1.add(60);
//        s1.add(null);
//        System.out.println(s1);

//        Set<Character> s2= new TreeSet<>();  //Black & Red Mechanism-insertion will be done in ascending order by default
                                                //null not allowed
//        s2.add('A');
//        s2.add('P');
//        s2.add('N');
//        s2.add('M');
//        System.out.println(s2);

    }
}
