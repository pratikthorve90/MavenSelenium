package DesignPatterns.SimpleFactory2;

public class Crow implements Bird{
    @Override
    public void makeSound() {
        System.out.println("Crow does Cow Cow");
    }
}
