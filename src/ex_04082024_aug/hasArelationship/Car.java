package ex_04082024_aug.hasArelationship;

public class Car {
    void drive()
    {
        new Tyre().Move();
        new Engines().starts();

    }

    public static void main(String[] args) {
        Car c= new Car();
        c.drive();
    }
}
