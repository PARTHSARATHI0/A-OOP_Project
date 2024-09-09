package RideSharingApplication;

public class ScooterFactory extends VehicleFactory {
	 @Override
	 public Vehicle createVehicle() {
	     return new Scooter();
	 }
	}