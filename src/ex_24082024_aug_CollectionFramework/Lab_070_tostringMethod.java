package ex_24082024_aug_CollectionFramework;
import java.util.*;
import java.util.ArrayList;

public class Lab_070_tostringMethod {
    public static void main(String[] args) {

        Student s  = new Student(1, "Praju");
        Student s1 = new Student(2, "Pratu");
        Student s2 = new Student(3, "Manju");

        List arrayList = new ArrayList();
        arrayList.add(s);
        arrayList.add(s1);
        arrayList.add(s2);
        System.out.println(arrayList);

        List linkedList = new LinkedList();
        linkedList.add(s);
        linkedList.add(s1);
        linkedList.add(s2);
        System.out.println(linkedList);
        linkedList.remove(s1);
        System.out.println(linkedList);
        linkedList.add("Radha");
        System.out.println(linkedList);
    }
}

class Student{
    private Integer id;
    private String name;

    public Student(Integer id, String name)
    {
        this.id=id;
        this.name=name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
