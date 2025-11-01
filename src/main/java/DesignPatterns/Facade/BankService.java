package DesignPatterns.Facade;

public class BankService {

    public boolean validateCard(String ccNumber){
        System.out.println("Validating CC Number " + ccNumber);
        return true;
    }

    public boolean processPayment(String ccNumber , double amount){
        System.out.println("Processing Payment of : " + amount + "On card  " + ccNumber);
        return true;
    }

}
