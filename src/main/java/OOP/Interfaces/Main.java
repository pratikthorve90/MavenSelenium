package OOP.Interfaces;

import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Herbivore> herbivores = List.of(
                new Human(),
                new Dog(),
                new Human()
        );

        for(Herbivore herbivore : herbivores){
           herbivore.eatPlant();

//            Human : Eating plant
//            Dog : eat plain
//            Human : Eating plant
        }
    }

}
