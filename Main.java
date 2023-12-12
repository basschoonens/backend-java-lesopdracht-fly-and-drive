import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the speed: ");
        int speed = scanner.nextInt();

        System.out.print("Enter the weight: ");
        float weight = scanner.nextFloat();

        Car c = new Car(speed, weight);
        // Display the initial state
        displayCarInformation(c);

        c.startEngine();
        c.accelerate();
        c.brake();
        c.changeGear();
        c.accelerate();
        c.brake();
        c.turnOffEngine();

        Plane p = new Plane(550, 6000);
        p.startEngine();
        p.takeOff();
        p.changeHeight();
        p.land();
        p.turnOffEngine();


        Scanner scanner2 = new Scanner(System.in);

        // Get user input for speed and weight
        System.out.print("Enter the speed of the flying car: ");
        int flyingCarSpeed = scanner.nextInt();

        System.out.print("Enter the weight of the flying car: ");
        float flyingCarWeight = scanner.nextFloat();

        // Create a FlyingCar instance with user-provided values
        FlyingCar flyingCar = new FlyingCar(speed, weight);

        // Display the initial state
        displayFlyingCarInformation(flyingCar);

        // Ask user to change speed and weight
        System.out.print("Enter the new speed for the flying car: ");
        flyingCarSpeed = scanner.nextInt();
        flyingCar.setSpeed(flyingCarSpeed);

        System.out.print("Enter the new weight for the flying car: ");
        flyingCarWeight = scanner.nextFloat();
        flyingCar.setWeight(flyingCarWeight);

        // Display the updated state
        displayFlyingCarInformation(flyingCar);

        generateAndDisplayRandomCars(10);

    }

    private static void displayCarInformation(Car c) {
        System.out.println("Car Information:");
        System.out.println("Speed: " + c.getSpeed());
        System.out.println("Weight: " + c.getWeight());
        System.out.println();
    }

    private static void displayFlyingCarInformation(FlyingCar flyingCar) {
        System.out.println("Flying Car Information:");
        System.out.println("Speed: " + flyingCar.getSpeed());
        System.out.println("Weight: " + flyingCar.getWeight());
        System.out.println();
    }

    private static void generateAndDisplayRandomCars(int count) {
        System.out.println("Generating and displaying information for " + count + " random cars:");
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int randomSpeed = random.nextInt(1000);
            float randomWeight = 500 + random.nextFloat() * 500; // Random weight between 500 and 1000

            Car randomCar = new Car(randomSpeed, randomWeight);
            displayCarInformation(randomCar);
        }


    }
}
