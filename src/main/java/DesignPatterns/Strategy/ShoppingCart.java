package DesignPatterns.Strategy;

import DesignPatterns.Facade.PaymentFacade;

public class ShoppingCart {

    public PaymentStrategy paymentStrategy;

    // Client can set the strategy dynamically VIMP
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount){
        if(this.paymentStrategy == null){
            System.out.println("Payment strategy is null");
        }
        else {
            paymentStrategy.pay(amount);
        }
    }
}
