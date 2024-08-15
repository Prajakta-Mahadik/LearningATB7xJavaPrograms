package ex_10082024_aug.SuperKeyword;

public class Person {

    public int age= 68;
    void message()
    {
        System.out.println("This is Person class");
    }

    void talk()
    {
        System.out.println("I am Person and I can talk");
    }
}

class Student extends Person{

    private int age= 28;

    @Override
    void message()
    {
        super.message();
        System.out.println("This is Student class");
    }

    void walk()
    {
        System.out.println("I can walk fast because my age is : " + this.age);
        System.out.println("I can walk slowly because my age is : " + super.age);
    }

    public static void main(String[] args) {
        Person p =new Person();
        p.message();
        p.talk();

        Student s= new Student();
        s.message();
        s.walk();
    }

}

