package Constructor;

public class Child extends Parent {

    int b;

    Child(){
        // Using super keyword to call the parameterized constructor as empty constructor is not
        // available-
        super("name");
        System.out.println("Child Constructor ");
    }

    public static void main(String[] args) {
        Child c = new Child();  // Prints Parent Constructor and then Child Constructor
    }
}
