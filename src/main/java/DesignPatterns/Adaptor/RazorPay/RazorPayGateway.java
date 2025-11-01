package DesignPatterns.Adaptor.RazorPay;

// THIS IS RAZOR PAY CODE IN THERE CODE BASE
public class RazorPayGateway {

    public long payByCreditCard(int ccNumber, int cvv , int expiryMonth, int expiryYear){
        System.out.println("Processing payments via RazorPay");
        return 123;
    }

    public String getStatus(long id){
        System.out.println("Processing status");
        return "SUCCESS";
    }


}
