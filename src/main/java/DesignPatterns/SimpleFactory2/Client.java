package DesignPatterns.SimpleFactory2;

public class Client {

    public static void main(String[] args) {
        Bird b1 = BirdFactory.getBird("crow");
        b1.makeSound();   // Crow does Cow Cow

        Bird b2 = BirdFactory.getBird("pigeon");
        b2.makeSound();   // Pigeon does paw paw
    }

}
