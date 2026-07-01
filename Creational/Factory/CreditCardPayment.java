package Creational.Factory;
import Creational.Factory.Payment;

public class CreditCardPayment implements Payment{
    public void payment(double amount){
        System.out.println("Paid" + amount + " with credit card");
    }
}
