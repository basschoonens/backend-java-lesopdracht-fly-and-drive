public class Car extends Vehicle implements Drivable{

    public Car(int speed, float weight) {
        setSpeed(speed);
        setWeight(weight);

    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Braking");
    }

    @Override
    public void changeGear() {
        System.out.println("Changing gear");
    }
}
