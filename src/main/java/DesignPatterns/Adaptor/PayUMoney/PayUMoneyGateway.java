package DesignPatterns.Adaptor.PayUMoney;

// THIS IS PAY U MONEY CODE IN THERE CODE BASE
public class PayUMoneyGateway {

    public long payByCreditCard(int ccNumber, int cvv , int expiryMonth, int expiryYear) {
        System.out.println("Processing payments VIA PayUMoney");
        return 123;
    }

    public String getStatus(long id){
        System.out.println("Processing status");
        return "SUCCESS";
    }
}
