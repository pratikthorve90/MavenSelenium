package DesignPatterns.Facade;

public class Client {

    public static void main(String[] args) {

        BankService bankService = new BankService();
        InvoiceService invoiceService = new InvoiceService();
        NotificationService notificationService = new NotificationService();

        PaymentFacade paymentFacade = new PaymentFacade(bankService, notificationService, invoiceService);

        paymentFacade.processPayment("abc123", "4111111111111111",100.10);

    }
}
