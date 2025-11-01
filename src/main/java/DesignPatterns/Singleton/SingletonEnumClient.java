package DesignPatterns.Singleton;

public class SingletonEnumClient {

    public static void main(String[] args) {
        SingleTonEnum singleTonEnum = SingleTonEnum.INSTANCE;
        singleTonEnum.readDB();
    }

}
