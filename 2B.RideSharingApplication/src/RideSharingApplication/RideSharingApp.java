package RideSharingApplication;

//RideSharingApp.java
public class RideSharingApp {
 public static void main(String[] args) {
     // Singleton: Manage user authentication
     UserAuth userAuth = UserAuth.getInstance();
     userAuth.login("JohnDoe");

     // Factory Method: Create a vehicle
     VehicleFactory vehicleFactory = new CarFactory();
     Vehicle vehicle = vehicleFactory.createVehicle();
     vehicle.drive();

     // Abstract Factory: Create a payment method
     PaymentFactory paymentFactory = new CreditCardFactory();
     PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
     paymentMethod.pay(20.00);

     userAuth.logout();
 }
}
