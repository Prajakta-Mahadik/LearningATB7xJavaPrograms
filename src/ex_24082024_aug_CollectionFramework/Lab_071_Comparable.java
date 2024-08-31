package ex_24082024_aug_CollectionFramework;
import java.util.*;

public class Lab_071_Comparable {
    public static void main(String[] args) {

        Students t= new Students(3,"Prajakta");
        Students t1= new Students(1,"Manju");
        Students t2= new Students(2,"Radha");
        Students t3= new Students(4,"Krishna");

        List arrayList = new ArrayList();
        arrayList.add(t);
        arrayList.add(t1);
        arrayList.add(t2);
        arrayList.add(t3);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}

//Comparable is use to compare 2 values based on id, it will not sort for values
//Comparable is interface. CompareTo() method it uses
class Students implements Comparable<Students>{

    private Integer rollNumbers;
    private String name;

    public Students(Integer rollNumbers, String name)
    {
      this.rollNumbers=rollNumbers;
      this.name=name;
    }

    public Integer getRollNumbers() {
        return rollNumbers;
    }

    public void setRollNumbers(Integer rollNumbers) {
        this.rollNumbers = rollNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "rollNumbers=" + rollNumbers +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Students next) {
//        return Integer.compare(this.rollNumbers, next.rollNumbers); //Integer.compare uses when compare 2 id/Integer values
//    }

    @Override
    public int compareTo(Students next) {
        return CharSequence.compare(this.name, next.name); //harSequence.compare uses when compare 2 characters values
    }
}

