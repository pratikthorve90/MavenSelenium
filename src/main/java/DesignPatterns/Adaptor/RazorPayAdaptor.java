package DesignPatterns.Adaptor;

import DesignPatterns.Adaptor.RazorPay.RazorPayGateway;

public class RazorPayAdaptor implements PaymentGateway{

    private RazorPayGateway razorPayGateway = new RazorPayGateway();

    @Override
    public long payViaCC(int ccNumber, int cvv , int expiryMonth, int expiryYear) {
        // Any custom conversion shall happen here.
        // Then you will call the actual Razor Pay API
        // Process the response and return
        return razorPayGateway.payByCreditCard(ccNumber, cvv, expiryMonth, expiryYear);
    }

    @Override
    public PaymentStatus getStatus(Long id) {
        return PaymentStatus.SUCCESS;
    }
}
