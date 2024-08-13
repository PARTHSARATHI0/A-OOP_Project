package ride.com;

public class RideSharingApp {
    public static void main(String[] args) {
        // Singleton: Manage User Authentication
        UserSession userSession = UserSession.getInstance();
        userSession.login("user123");

        // Factory Method: Create Vehicles
        VehicleFactory vehicleFactory;
        vehicleFactory = new CarFactory();  // You can switch to BikeFactory or ScooterFactory as needed
        Vehicle vehicle = vehicleFactory.createVehicle();

        // Abstract Factory: Create Payment Method
        PaymentFactory paymentFactory;
        paymentFactory = new CreditCardFactory();  // You can switch to PayPalFactory as needed
        PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();

        // User takes a ride and makes a payment
        if (userSession.isAuthenticated()) {
            System.out.println("User " + userSession.getUserId() + " requested a ride.");
            vehicle.ride();
            paymentMethod.pay(15.0);  // Example payment amount
        }

        // User logs out
        userSession.logout();
    }
}
