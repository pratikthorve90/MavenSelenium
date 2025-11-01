package DesignPatterns.Facade;

public class InvoiceService {

    public int generateInvoice(double amount){
        System.out.println("Invoice successfully generated for amount " + amount);
        return 1001;
    }
}
