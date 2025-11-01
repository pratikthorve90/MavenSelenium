package DesignPatterns.Observer;

public class Client {

    public static void main(String[] args) {

        EmailSubscriber emailSubscriber = new EmailSubscriber("Pratik@gmail.com");
        SmsSubscriber smsSubscriber = new SmsSubscriber("9092");
        SmsSubscriber smsSubscriber1 = new SmsSubscriber("9960");

        Channel channel = new Channel();
        channel.subscriber(emailSubscriber);
        channel.subscriber(smsSubscriber);
        channel.subscriber(smsSubscriber1);

        // For the email address Pratik@gmail.com Following  New video is released is sent
        //For the mobile number 9092 Following  New video is released is sent
        //For the mobile number 9960 Following  New video is released is sent
        channel.notifyObservers("New video is released");

        channel.unSubscriber(smsSubscriber1);

//        For the email address Pratik@gmail.com Following  New video is released again is sent
//        For the mobile number 9092 Following  New video is released again is sent

        channel.notifyObservers("New video is released again");


    }


}
