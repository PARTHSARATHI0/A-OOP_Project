package Vehicle;

public class Car extends Vehicle {
    public Car() {
        this.type = "Car";
    }

    @Override
    public void drive() {
        System.out.println("Driving a car...");
    }
}

