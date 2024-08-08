package ex_04082024_aug;

public class Car {
    String name;
    int tyre=4;       //Instance Variable: throughout the code

    void drive()
    {
        int tyre=5;  //local variable: inside function only
        System.out.println(tyre);
    }

    void run()
    {
        System.out.println(tyre);
    }

    public static void main(String[] args) {
    Car c= new Car();
    c.drive();
    c.run();
    }
}
