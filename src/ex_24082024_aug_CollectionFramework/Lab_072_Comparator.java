package ex_24082024_aug_CollectionFramework;

import java.util.*;


public class Lab_072_Comparator {
    public static void main(String[] args) {

        Employees e = new Employees(4,"Nilesh");
        Employees e1= new Employees(1,"Priyanka");
        Employees e2= new Employees(3,"Lavesh");
        Employees e3= new Employees(2,"Aniket");


        List ll = new ArrayList<>(10);
        System.out.println(ll.size());
        ll.add(e);
        ll.add(e1);
        ll.add(e2);
        ll.add(e3);
        System.out.println(ll);
        System.out.println(ll.size());
        Collections.sort(ll, new SortByEid());
        System.out.println(ll);
        Collections.sort(ll, new SortByEidDesc());
        System.out.println(ll);
        Collections.sort(ll, new SortByName());
        System.out.println(ll);
    }
}

//sort by e_id
class SortByEid implements Comparator<Employees> {
    @Override
    public int compare(Employees o1, Employees o2) {
        return Integer.compare(o1.getE_id(),o2.getE_id());
    }
}

//sort reverse by e_id
class SortByEidDesc implements Comparator<Employees> {
    @Override
    public int compare(Employees o1, Employees o2) {
        return Integer.compare(o2.getE_id(),o1.getE_id());
    }
}

//sort by name
class SortByName implements Comparator<Employees> {
    @Override
    public int compare(Employees o1, Employees o2) {
        return o1.getName1().compareTo(o2.getName1());
    }
}

class Employees {

    private Integer e_id;
    private String name1;

    public Employees(Integer e_id, String name1) {
        this.e_id = e_id;
        this.name1 = name1;
    }

    public Integer getE_id() {
        return e_id;
    }

    public void setE_id(Integer e_id) {
        this.e_id = e_id;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    @Override
    public String toString() {
        return "Students{" +
                "rollNumbers=" + e_id +
                ", name='" + name1 + '\'' +
                '}';
    }
}



