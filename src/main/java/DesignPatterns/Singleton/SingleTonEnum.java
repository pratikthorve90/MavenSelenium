package DesignPatterns.Singleton;

public enum SingleTonEnum {

    INSTANCE;

    public void readDB(){
        System.out.println("Read DB");
    }
}
