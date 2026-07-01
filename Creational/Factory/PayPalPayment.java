package Creational.Factory;
import Creational.Factory.Payment;

public class PayPalPayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("paid" + amount + " with paypal");
    }
}
