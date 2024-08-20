package ex_18082024_aug;

import java.util.Iterator;
import java.util.Vector;

public class Lab_067 {
    public static void main(String[] args) {
        Vector v= new Vector();
        v.add("Prajakta");
        v.add("Manjunath");
        v.add("Shinde");

        System.out.println(v);

        //Iterators
        Iterator<String> it= v.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
