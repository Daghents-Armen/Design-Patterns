package Creational.Factory;

public class PaymentService {
   private final PaymentFactory factory;

    public PaymentService(PaymentFactory factory){
        this.factory = factory;
    }

    public void makePayment(PaymentType type, double amount){
        Payment payment = this.factory.create(type);

        payment.pay(amount);
    }
}
