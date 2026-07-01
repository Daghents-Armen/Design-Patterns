package Creational.Factory;

public class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid" + amount + " with credit card");
    }
}
