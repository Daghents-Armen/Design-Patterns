package Creational.Factory;

public class PayPalFactory implements PaymentFactory{
    @Override
    public Payment create(){
        return new PayPalPayment();
    }
}
