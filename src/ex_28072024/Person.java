package ex_28072024;

public class Person {
    //oops concepts
    //Person has some attributes and behaviours
    String gender;  //attributes or properties
    int age;       //attributes or properties
    String name;   //attributes or properties
    int DOB;       //attributes or properties

    void sleep() {}  //behaviours or methods

    void talk() { }  //behaviours or methods

    void work() { }  //behaviours or methods

    public static void main(String[] args) {
        Person person =new Person();
        person.name= "Prajakta";
        System.out.println(person.name);
        person.sleep();

        Person person2 =new Person();
        person2.age=29;
        System.out.println(person.age);
        person2.talk();

        Person person3 =new Person();
        person3.gender="Female";
        System.out.println(person.gender);
        person3.work();

    }

}
