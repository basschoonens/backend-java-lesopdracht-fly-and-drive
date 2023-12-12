public class FlyingCar extends Vehicle implements Drivable, Flyable{


    public FlyingCar(int speed, float weight) {
        setSpeed(speed);
        setWeight(weight);
    }

    @Override
    public void accelerate() {
        System.out.println("Flying car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Flying car is braking.");
    }

    @Override
    public void changeGear() {
        System.out.println("Flying car is changing gear.");
    }

    @Override
    public void takeOff() {
        System.out.println("Flying car is taking off.");
    }

    @Override
    public void land() {
        System.out.println("Flying car is landing.");
    }

    @Override
    public void changeHeight() {
        System.out.println("Flying car is changing height.");
    }

}
