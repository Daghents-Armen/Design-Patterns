package Creational.Factory;

public class CreditCardFactory implements PaymentFactory{
    @Override
    public Payment create(){
        return new CreditCardPayment();
    }
}
