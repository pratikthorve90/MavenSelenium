package DesignPatterns.Adaptor;

public class Flipkart {

    private PaymentGateway paymentGateway;

    public Flipkart(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public Long makePaymentViaCC(int ccNumber, int cvv , int expiryMonth, int expiryYear){
        Long transcationID = paymentGateway.payViaCC(ccNumber, cvv, expiryMonth, expiryYear);
        return transcationID;
    }

    public PaymentStatus getPaymentStatus(Long transcationID){
        return paymentGateway.getStatus(transcationID);
    }

}
