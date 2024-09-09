package Vehicle;

public class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        switch (type) {
            case "Car":
                return new Car();
            case "Bike":
                return new Bike();
            case "Truck":
                return new Truck();
            default:
                throw new IllegalArgumentException("Unknown vehicle type.");
        }
    }
}
