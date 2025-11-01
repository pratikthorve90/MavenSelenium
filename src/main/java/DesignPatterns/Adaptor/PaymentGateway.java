package DesignPatterns.Adaptor;

public interface PaymentGateway {

    long payViaCC(int ccNumber, int cvv , int expiryMonth, int expiryYear);

    PaymentStatus getStatus(Long id);

}
