package OOP.Interfaces;

public class Cat extends Mammal implements Herbivore{

    @Override
    public void eatPlant() {
        System.out.println("Cat Eating plant");
    }
}
