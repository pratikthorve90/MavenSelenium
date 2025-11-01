package DesignPatterns.FactoryMethod;

// Step 2 : Implement class
public class SMSNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("SMS NotificationService");
    }
}
