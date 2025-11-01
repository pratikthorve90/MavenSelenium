package DesignPatterns.FactoryMethod;

// Step 2 : Implement class
public class EmailNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Email notification");
    }
}
