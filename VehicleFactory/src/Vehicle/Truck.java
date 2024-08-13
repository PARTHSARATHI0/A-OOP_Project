package Vehicle;

public class Truck extends Vehicle {
    public Truck() {
        this.type = "Truck";
    }

    @Override
    public void drive() {
        System.out.println("Driving a truck...");
    }
}

