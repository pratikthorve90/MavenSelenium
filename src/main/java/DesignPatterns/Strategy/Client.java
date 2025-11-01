package DesignPatterns.Strategy;

public class Client {

    public static void main(String[] args) {

        ShoppingCart sc = new ShoppingCart();

        sc.checkout(88.98);   // Payment strategy is null

        sc.setPaymentStrategy(new CreditCardPayment("4111111111111111"));
        sc.checkout(100.212);

        // Switch at runtime to another payment method

        sc.setPaymentStrategy(new PaypalPayment("payme@gmail.com"));
        sc.checkout(99.99);
    }
}
