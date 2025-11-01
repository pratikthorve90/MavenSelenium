package DesignPatterns.Observer;

public class SmsSubscriber implements Observer {

    private String mobileNo;

    public SmsSubscriber(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public void notify(String message) {
        System.out.println("For the mobile number " + this.mobileNo + " Following  " +  message + " is sent");
    }
}
