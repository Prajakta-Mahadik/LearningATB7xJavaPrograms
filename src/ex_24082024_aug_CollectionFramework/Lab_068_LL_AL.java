package ex_24082024_aug_CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;

public class Lab_068_LL_AL {
    public static void main(String[] args) {
        //LinkedList is also a class. It stores in linking format and internally follows doubly linkedlist
        //Its non synchronised  //1st and last node is null  //get value by index
        LinkedList l= new LinkedList();  //initial default capacity is not there
        System.out.println(l.size());
        l.add("Node 1");
        l.add("Node 2");
        l.add("Node 3");
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.get(1));

        System.out.println("-----------------------------------------------");
        //array list is also an class. It stores in continuous memory and internally dynamically(if arraylist size
        //reaches to 10 it will automatically increase size of an arraylist by 50%). Its non synchronised

        ArrayList<String> a= new ArrayList<>();   //initial default size is 0
        System.out.println(a.size());  //initial size is 0
        a.add("Prajakta");
        a.add("Pooja");
        a.add("Manjunath");
        a.add("Pratik");
        Collections.sort(a);
        System.out.println(a);
        Collections.reverse(a);
        System.out.println(a);
        System.out.println(a.size());

        Integer[] arrayValues = new Integer[] {10,20,30};
        ArrayList a1= new ArrayList(Arrays.asList(arrayValues));
        a1.addAll(a);
        System.out.println(a1);

        Collections.synchronizedList(a);

    }
}
