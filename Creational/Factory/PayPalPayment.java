package Creational.Factory;
import Creational.Factory.Payment;

public class PayPalPayment implements Payment{
    public void payment(double amount){
        System.out.println("paid" + amount + " with paypal");
    }
}
