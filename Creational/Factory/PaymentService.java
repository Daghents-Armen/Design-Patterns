package Creational.Factory;

public class PaymentService {
   private final PaymentFactory factory;

    public PaymentService(PaymentFactory factory){
        this.factory = factory;
    }

    public void makePayment(double amount){
        Payment payment = this.factory.create();

        payment.pay(amount);
    }
}
