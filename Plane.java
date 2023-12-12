public class Plane extends Vehicle implements Flyable{

    public Plane(int speed, float weight) {
        setSpeed(speed);
        setWeight(weight);
    }

    @Override
    public void takeOff() {
        System.out.println("Taking off");
    }

    @Override
    public void land() {
        System.out.println("Landing");
    }

    @Override
    public void changeHeight() {
        System.out.println("Change height to");
    }

}
