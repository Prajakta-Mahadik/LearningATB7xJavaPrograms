package ex_11082024_aug.interfaces.ex1;

public class Thar implements Engine {

    @Override
    public void startEngine() {
        System.out.println("Staring Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("stopping Engine");
    }

    void drive()
    {
        startEngine();
        stopEngine();
        System.out.println("Driving speed is 80km/hr");
    }
}
