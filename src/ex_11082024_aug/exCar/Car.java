package ex_11082024_aug.exCar;

class Car extends Engine {

    @Override
    void Open() {
        System.out.println("Open the Car");
    }

    @Override
    void start() {
        System.out.println("Starting the Car");
    }

    @Override
    void partOfGearBox() {
        System.out.println("This are part of Gear Box");
    }

    @Override
    void stop() {
        System.out.println("Stopping the Car");
    }

    @Override
    void speed() {
        System.out.println("Speed of the Car is 100km/hr");
    }
}
