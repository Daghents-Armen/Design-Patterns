package Creational.Factory;

public class Main {
    public static void main(String[] args){
        PaymentService payPalService = new PaymentService(new PayPalFactory());
        PaymentService creditCardService = new PaymentService(new CreditCardFactory());
        payPalService.makePayment(10.8);
        creditCardService.makePayment(13.2);
    }
}
