package DesignPatterns.Singleton;

public class Singleton {

    private static Singleton instance;  // lazy loading , create instance when needed.
       // Can create multiple instances when called first time

    private Singleton() {
        // Constructor , something like make DB connection or logs file connection
    }
    // We can also have parameterised constructors here
    // Read command line parameters and then load the config file based on env passed

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void executeQuery(String query){
        // Execute DB query
    }

    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        s1.executeQuery("this is the query");
    }

}
