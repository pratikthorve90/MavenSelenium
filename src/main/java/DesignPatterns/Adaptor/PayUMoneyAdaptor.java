package DesignPatterns.Adaptor;

import DesignPatterns.Adaptor.PayUMoney.PayUMoneyGateway;

public class PayUMoneyAdaptor implements PaymentGateway{

    PayUMoneyGateway gateway = new PayUMoneyGateway();

    @Override
    public long payViaCC(int ccNumber, int cvv, int expiryMonth, int expiryYear) {
        // Any custom conversion shall happen here.
        // Then you will call the actual Pay U API
        // Process the response and return
        return gateway.payByCreditCard(ccNumber, cvv, expiryMonth, expiryYear);

    }

    @Override
    public PaymentStatus getStatus(Long id) {
        return PaymentStatus.SUCCESS;
    }
}
