package RideSharingApplication;

public class CreditCardFactory implements PaymentFactory {
	 @Override
	 public PaymentMethod createPaymentMethod() {
	     return new CreditCardPayment();
	 }
	}