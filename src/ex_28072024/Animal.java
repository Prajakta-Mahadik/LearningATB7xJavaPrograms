package ex_28072024;

public class Animal {
    //attributes or property
    String breed;
    String color;
    int age;
    String size;
    String name;

    //behaviour or method
    void eat()   {}
    void sleep() {}
    void walk()  {}
    void run()   {}
    void bark()  {}

    //main method call
    public static void main(String[] args) {
        //creating object
        Animal a= new Animal();
        a.breed="Lebrodog";
        a.color="Beige";
        a.age=3;
        a.size="Big";
        a.name="Cooper";
        System.out.println("My pet name is:" +a.name+" His bread is:"+a.breed+" His Color is:"+a.color+" His age is"+a.age+" His size is:"+a.size);
        a.sleep();
        a.bark();

        Animal b=new Animal();
        b.breed="Persian cat";
        b.color="White";
        b.age=1;
        b.size="small";
        b.name="Coffee";
        System.out.println("My pet name is:" +b.name+" Her bread is:"+b.breed+" Her Color is:"+b.color+" Her age is"+b.age+" Her size is:"+b.size);
        b.bark();
        b.run();
    }

}
