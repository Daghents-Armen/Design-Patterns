package Creational.Factory;

public class PaymentFactory {
   public Payment create(PaymentType type){
        if(type == null){
            throw new IllegalArgumentException("Payment type cannot be null");
        }

        return switch(type){
            case PAYPAL -> new PayPalPayment();
            case CREDIT_CARD -> new CreditCardPayment();
        };
    }
}
