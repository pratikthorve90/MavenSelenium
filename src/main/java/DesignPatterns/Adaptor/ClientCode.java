package DesignPatterns.Adaptor;

public class ClientCode {

    public static void main(String[] args) {

        Flipkart fk = new Flipkart(new PayUMoneyAdaptor());
        Long status = fk.makePaymentViaCC(41111111,123,3,25);
        fk.getPaymentStatus(status);


        Flipkart fk1 = new Flipkart(new RazorPayAdaptor());
        Long status1 = fk1.makePaymentViaCC(41111111,123,3,25);
        fk1.getPaymentStatus(status);

    }
}
