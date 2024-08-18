package ex_11082024_aug.exCar;

public class Tesla extends Car {

    void drive()
    {
        Open();
        start();
        partOfGearBox();
        stop();
    }

    @Override
    void speed() {
        System.out.println("Speed of Tesla is 200km/hr");
    }
}
