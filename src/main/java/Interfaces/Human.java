package Interfaces;

public class Human extends Mammal implements Onmivore{
    @Override
    public void eatAnimal() {
        System.out.println("Human : Eating animal");
    }

    @Override
    public void eatPlant() {
        System.out.println("Human : Eating plant");
    }
}
