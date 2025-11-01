package DesignPatterns.SimpleFactory2;

public class Pigeon implements Bird{
    @Override
    public void makeSound() {
        System.out.println("Pigeon does paw paw");
    }
}
