package ex_10082024_aug.SuperKeyword;

public class Car {

    public int max_speed= 280;

    void drive()
     {
         System.out.println("My car speed is :" + this.max_speed);
     }
    Car()
    {
        System.out.println("This is Default Constructor");
    }
    public Car(int number_of_seats)
    {
        System.out.println("This is Default Constructor");
    }

}

class Baleno extends Car{
    public int max_speed=200;

    @Override
    void drive()
    {
        super.drive();
        System.out.println("My Parent Car speed is : "+ super.max_speed);
        System.out.println("My Baleno car speed is :" + this.max_speed);
    }

    Baleno()
    {
        super();
        //super(5);
        System.out.println("This is Default Constructor of baleno");
        this.drive();
    }



    public static void main(String[] args) {
        Car c= new Car();
        Car c1= new Car(5);
        c.drive();

        Baleno b= new Baleno();

    }

}
