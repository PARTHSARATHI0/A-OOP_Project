package Vehicle;

public class Bike extends Vehicle {
    public Bike() {
        this.type = "Bike";
    }

    @Override
    public void drive() {
        System.out.println("Riding a bike...");
    }
}

