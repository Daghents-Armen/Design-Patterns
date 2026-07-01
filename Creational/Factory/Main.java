package Creational.Factory;

public class Main {
    public static void main(String[] args){
        PaymentFactory factory = new PaymentFactory();
        PaymentService service = new PaymentService(factory);
        service.makePayment(PaymentType.PAYPAL, 10.8);
        service.makePayment(PaymentType.CREDIT_CARD, 13.2);
    }
}
