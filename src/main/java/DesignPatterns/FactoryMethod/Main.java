package DesignPatterns.FactoryMethod;

public class Main {

    public static void main(String[] args) {

        NotificationFactory emailFactory = new EmailNotificationFactory();
        NotificationFactory smsFactory = new SMSNotificationFactory();

        emailFactory.createNotification().notifyUser();
        smsFactory.createNotification().notifyUser();

    }
}
