package ex_24082024_aug_CollectionFramework;

import java.util.Vector;
import java.util.Arrays;

public class Lab_067_vectors {
    public static void main(String[] args) {
//Vector: are thread safe and synchronised so it's slow
//  When ever you work with collection framework just remember below points..
//  1. Create List/Object.
//  2. Add the elements in the list
//  3. Retrieve the elements from the list
//  4. Verification of elements in the list
//  5. Update the elements in the list
//  6. Delete the elements from the list
// Vector is legacy class. It stores in continuous memory and internally it follows array and dynamically(if arraylist size
//reaches to 10 it will automatically increase size of an vector by 100%)
        Integer[] arrayValues = new Integer[]{23,54,66};

        Vector v= new Vector(Arrays.asList(arrayValues)); // Create List/Object.
        System.out.println(v.size());  //before adding any value size of vector is 0 and default initial capacity is 10
        v.add("Prajakta");
        v.add("Manjunath");
        v.add("Shinde");
        System.out.println(v);
        System.out.println(v.size());

        v.add(0,"Pooja");            //Add the elements in the list
        System.out.println(v);
        System.out.println(v.get(2));              //Retrieve the elements from the list
        System.out.println(v.contains("Pooja"));   //Verification of elements in the list
        System.out.println(v.contains("pooja"));   //Verification of elements in the list
        v.set(3,"Pratik");                         //Update the elements in the list
        System.out.println(v);

        v.remove("Pratik");                     //Delete the elements from the list
        v.remove(0);                         //Delete the elements from the list
        System.out.println(v);


        Vector v1 =new Vector();
        v1.add(1989);
        v1.add(1995);
        v.addAll(v1);
        System.out.println(v);
        System.out.println(v.containsAll(v1));
        v.removeAll(v1);
        System.out.println(v);
        System.out.println(v.containsAll(v1));

        //Convert vector into array.
        Object[] o= v.toArray();
        System.out.println(Arrays.toString(o));

        //Iterators
//        Iterator<String> it= v.iterator();
//        while (it.hasNext())
//        {
//            System.out.println(it.next());
//        }

    }
}
