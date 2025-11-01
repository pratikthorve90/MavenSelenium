package DesignPatterns.FactoryMethod;

// Step 4 : Create concrete factory implementation
public class EmailNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
