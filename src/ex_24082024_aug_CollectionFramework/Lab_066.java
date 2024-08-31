package ex_24082024_aug_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_066 {
    public static void main(String[] args) {
        List<String> arr2= new ArrayList();
        arr2.add("Prajakta");
        arr2.add("Pooja");
        arr2.add("Dinesh");
        arr2.add("Mahadik");
        System.out.println(arr2);

        //advance for loop
//        for(String str: arr2)
//        {
//            System.out.println(str);
//        }

        //Iterator
        Iterator<String> its= arr2.iterator();
        while (its.hasNext())
        {
            System.out.println(its.next());
        }

    }
}

