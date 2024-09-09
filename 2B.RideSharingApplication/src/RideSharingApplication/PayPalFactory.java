package RideSharingApplication;

public class PayPalFactory implements PaymentFactory {
	 @Override
	 public PaymentMethod createPaymentMethod() {
	     return new PayPalPayment();
	 }
	}