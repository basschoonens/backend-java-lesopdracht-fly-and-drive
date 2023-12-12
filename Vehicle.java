abstract public class Vehicle {

    int speed;
    float weight;

     public void startEngine(){
        System.out.println("Engine starts. Vroem vroem");
    }

    public void turnOffEngine(){
        System.out.println("Engine turns off. Silence");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

}
