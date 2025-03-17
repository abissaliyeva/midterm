package payment;

public class CreditCardPayment implements PaymentMethod{
    public void processPayment(double amount){
        System.out.println("Processing Credit Card payment of $" + amount);
    }
}