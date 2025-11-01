package DesignPatterns.Observer;

public class EmailSubscriber implements Observer {

    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void notify(String message) {
        System.out.println("For the email address " + this.email + " Following  " +  message + " is sent");
    }
}
