package DesignPatterns.Facade;

public class PaymentFacade {

    BankService  bank;
    NotificationService notification;
    InvoiceService invoice;

    public PaymentFacade(BankService bank, NotificationService notification, InvoiceService invoice) {
        this.bank = bank;
        this.notification = notification;
        this.invoice = invoice;
    }

    public void processPayment(String userId, String ccNumber, double amount) {
        bank.validateCard(ccNumber);
        bank.processPayment(ccNumber, amount);

        double orderId = invoice.generateInvoice(amount);

        notification.notifyUser(userId, "Payment Successfully Processed , orderId is " + orderId);
    }
}
