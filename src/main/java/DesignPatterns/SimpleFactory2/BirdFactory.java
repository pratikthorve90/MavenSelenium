package DesignPatterns.SimpleFactory2;

public class BirdFactory {

    public static Bird getBird(String type){

        switch (type.toLowerCase()){
            case  "crow" :
                return new Crow();
            case  "pigeon" :
                return new Pigeon();

                default : throw new IllegalArgumentException("Invalid bird type");
        }
    }
}
