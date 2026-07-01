package Creational.Factory;

public class PayPalPayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("paid" + amount + " with paypal");
    }
}
