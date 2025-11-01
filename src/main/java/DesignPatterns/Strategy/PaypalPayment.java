package DesignPatterns.Strategy;

public class PaypalPayment implements PaymentStrategy {

    private String emailAddress;

    public PaypalPayment(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Success charged card " + emailAddress + " for amount" + amount);
    }
}
