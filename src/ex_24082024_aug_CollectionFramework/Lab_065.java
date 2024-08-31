package ex_24082024_aug_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_065 {
    public static void main(String[] args) {
//        ArrayList arr= new ArrayList();
//        arr.add("Prajakta");
//        arr.add(1,"Pratik");
//        arr.add("Pooja");
//        arr.add(3,"Dinesh");
//        System.out.println(arr);
//        System.out.println(arr.get(0));
//        System.out.println(arr.clone());
//        System.out.println(arr.contains("Pooja"));
//        System.out.println(arr.isEmpty());
//        System.out.println(arr.size());
//        System.out.println(arr.reversed());


        List arr1= new ArrayList();
        arr1.addFirst("10");
        arr1.add("40");
        arr1.add(2,"67");
        arr1.add("98");
        arr1.addLast("95");
//      System.out.println(arr1.size());
        Collections.sort(arr1);
        System.out.println(arr1);
        Collections.reverse(arr1);
        System.out.println(arr1);
       // System.out.println(arr1.getClass());
//        System.out.println(arr1.get(2));
   //     System.out.println(arr1.contains("67"));
       // System.out.println(arr1.remove("1995"));
        //to get all element one by one:
//        for (int i =0; i<=arr1.size();i++ ) {
//            try {
//                System.out.println(arr1.get(i));
//            } catch (Exception e) {
//                System.out.println("ArraryOutOfBound");
//            } finally {
//                System.out.println("I will execute");
//            }
//        }
//
//        //object call
//        for (Object o: arr1)
//        {
//            System.out.println(o);
//        }
    }
}
